package com.github.supercoding.service;

import com.github.supercoding.repository.Items.ElectronicStoreItemRepository;
import com.github.supercoding.repository.Items.ItemEntity;
import com.github.supercoding.repository.storeSales.StoreSales;
import com.github.supercoding.repository.storeSales.StoreSalesRepository;
import com.github.supercoding.service.mapper.ItemMapper;
import com.github.supercoding.web.dto.items.BuyOrder;
import com.github.supercoding.web.dto.items.Item;
import com.github.supercoding.web.dto.items.ItemBody;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ElectronicStoreItemService {

    // 로그 설정
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    private final ElectronicStoreItemRepository electronicStoreItemRepository;
    private final StoreSalesRepository storeSalesRepository;


    // 1. 모든 아이템 조회(get)
    public List<Item> findAllItem() {
        List<ItemEntity> itemEntities = electronicStoreItemRepository.findAllItems();
        return itemEntities.stream().map(ItemMapper.INSTANCE::itemEntityToItem).collect(Collectors.toList());
    }

    // 2. 새로운 아이템 등록(post)
    public Integer saveItem(ItemBody itemBody) {

        ItemEntity itemEntity = new ItemEntity(null, itemBody.getName(), itemBody.getType(),
                itemBody.getPrice(), itemBody.getSpec().getCpu(),
                itemBody.getSpec().getCapacity());

        return electronicStoreItemRepository.saveItem(itemEntity);
    }

    // 3. ID Path로 아이템 조회(get), 4.쿼리 파라미터로 ID 조회
    public Item findItemById(String id) {
        Integer idInt = Integer.parseInt(id);
        ItemEntity itemEntity = electronicStoreItemRepository.findItemById(idInt);
        Item item = ItemMapper.INSTANCE.itemEntityToItem(itemEntity);
        return item;
    }

    // 5.여러개의 ID쿼리 파라미터로 조회
    public List<Item> findItemsByIds(List<String> ids) {
        List<ItemEntity> itemEntities = electronicStoreItemRepository.findAllItems();
        return itemEntities.stream()
                            .map(ItemMapper.INSTANCE::itemEntityToItem)
                            .filter((item -> ids.contains(item.getId())))
                            .collect(Collectors.toList());
    }

    // 6. path ID로 아이템 삭제(delete)
    public void deleteItem(String id) {
        Integer idInt = Integer.parseInt(id);
        electronicStoreItemRepository.deleteItem(idInt);
    }


    // 7. pathID와 Body로 업데이트(update)
    public Item updateItem(String id, ItemBody itemBody) {
        Integer idInt = Integer.valueOf(id);
        ItemEntity itemEntity  = new ItemEntity(idInt, itemBody.getName(), itemBody.getType(),
                itemBody.getPrice(), itemBody.getSpec().getCpu(),
                itemBody.getSpec().getCapacity());

        ItemEntity itemEntityUpdated = electronicStoreItemRepository.updateItemEntity(idInt, itemEntity);

        return ItemMapper.INSTANCE.itemEntityToItem(itemEntityUpdated);
    }


    @Transactional(transactionManager = "tm1" )
    public Integer buyItems(BuyOrder buyOrder) {

        // 1. BuyOrder 에서 상품 ID와 수량을 얻어낸다.
        // 2. 상품을 조회하여 수량이 얼마나 있는지 확인한다.
        Integer itemId = buyOrder.getItemId();
        Integer itemNums = buyOrder.getItemNums();

        ItemEntity itemEntity = electronicStoreItemRepository.findItemById(itemId);

        if (itemEntity.getStoreId() == null ) throw new RuntimeException("매장을 찾을 수 없습니다.");
        if (itemEntity.getStock() <= 0 ) throw new RuntimeException("상품의 재고가 없습니다.");

        Integer successBuyItemNums;
        if ( itemNums > itemEntity.getStock() ) successBuyItemNums = itemEntity.getStock();
        else successBuyItemNums = itemNums;

        // 3. 상품의 수량과 가격을 가지고 계산하여 총 가격을 구한다.
        Integer totalPrice = successBuyItemNums * itemEntity.getPrice();

        // 4. 상품의 재고에 기존 계산한 재고를 구매하는 수량을 뺀다.
        electronicStoreItemRepository.updateItemStock(itemId, itemEntity.getStock() - successBuyItemNums);


        if ( successBuyItemNums == 4 ) {
            logger.error("4개를 구매하는건 허락하지 않습니다.");
            throw new RuntimeException("4개를 구매하는건 허락하지 않습니다.");
        }

        // 매장 매상 추가
        // 5. 상품 구매하는 수량 * 가격만큼 가게 매상으로 올린다.
        // (단, 재고가 아예 없거나 매장을 찾을 수 없으면 살 수 없다.)
        StoreSales storeSales = storeSalesRepository.findStoreSalesById(itemEntity.getStoreId());
        storeSalesRepository.updateSalesAmount(itemEntity.getStoreId(), storeSales.getAmount() + totalPrice);

        return successBuyItemNums;
    }
}


