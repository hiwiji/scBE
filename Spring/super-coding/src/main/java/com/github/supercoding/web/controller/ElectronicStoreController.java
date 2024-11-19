package com.github.supercoding.web.controller;

import com.github.supercoding.repository.ElectronicStoreItemRepository;
import com.github.supercoding.repository.ItemEntity;
import com.github.supercoding.web.dto.Item;
import com.github.supercoding.web.dto.ItemBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/api")
public class ElectronicStoreController {


    private ElectronicStoreItemRepository electronicStoreItemRepository;


    public ElectronicStoreController(ElectronicStoreItemRepository electronicStoreItemRepository) {
        this.electronicStoreItemRepository = electronicStoreItemRepository;
    }

    private static int serialItemId = 1;

    // db가 연결되어 있지 않아 list로 db 데이터값 만들어주기
    private List<Item> items = new ArrayList<>(Arrays.asList(
            new Item(String.valueOf(serialItemId++), "Apple iPhone 12 Pro Max", "Smartphone", 1490000, "A14 Bionic", "512GB"),
            new Item(String.valueOf(serialItemId++), "Samsung Galaxy S21 Ultra", "Smartphone", 1690000, "Exynos 2100", "256GB"),
            new Item(String.valueOf(serialItemId++), "Google Pixel 6 Pro", "Smartphone", 1290000, "Google Tensor", "128GB"),
            new Item(String.valueOf(serialItemId++), "Dell XPS 15", "Laptop", 2290000, "Intel Core i9", "1TB SSD"),
            new Item(String.valueOf(serialItemId++), "Sony Alpha 7 III", "Mirrorless Camera", 2590000, "BIONZ X", "No internal storage"),
            new Item(String.valueOf(serialItemId++), "Microsoft Xbox Series X", "Gaming Console", 499000, "Custom AMD Zen 2", "1TB SSD")
    ));

    // 1. 모든 아이템 조회(get)
    @GetMapping("/items")
    public List<Item> findAllItem() {
        List<ItemEntity> itemEntities = electronicStoreItemRepository.findAllItems();
        return itemEntities.stream().map(Item::new).collect(Collectors.toList());
    }

    // 2. 새로운 아이템 등록(post)

    @PostMapping("/items")

    public String registerItem(@RequestBody ItemBody itemBody) {
        // 아이템등록은 아이템조회랑 필드값이 다름
        // (조회는 시작이 id로 시작하는데, 등록은 이름부터 시작해서 새로운 dto를 만들어준다)
//        Item newItem = new Item(serialItemId++, itemBody);
//        items.add(newItem);
//        return "ID: " + newItem.getId();

        ItemEntity itemEntity = new ItemEntity(null, itemBody.getName(), itemBody.getType(),
                itemBody.getPrice(), itemBody.getSpec().getCpu(),
                itemBody.getSpec().getCapacity());

        Integer itemId = electronicStoreItemRepository.saveItem(itemEntity);
        return "ID : " + itemId;
    }

    // 3. ID Path로 아이템 조회(get)
    @GetMapping("/items/{id}")
    public Item findItemByPathId(@PathVariable String id) {
        Item itemFounded = items.stream()
                                .filter((item -> item.getId().equals(id)))
                                .findFirst()
                                .orElseThrow(() -> new RuntimeException());

        return itemFounded;
    }

    // 4. 쿼리 파라미터로 ID 조회
    @GetMapping("/items-query")
    public Item findItemByQueryId(@RequestParam("id") String id) {
        Item itemFounded = items.stream()
                .filter((item -> item.getId().equals(id)))
                .findFirst()
                .orElseThrow(() -> new RuntimeException());

        return itemFounded;
    }

    // 5.여러개의 ID쿼리 파라미터로 조회
    @GetMapping("/items-queries")
    public List<Item> findItemByQueryIds(@RequestParam("id") List<String> ids) {

        Set<String> idSet = ids.stream().collect(Collectors.toSet());

        List<Item> itemsFound = items.stream()
                                     .filter((item -> idSet.contains(item.getId())))
                                     .collect(Collectors.toList());
        return itemsFound;
    }

    // 6. path ID로 아이템 삭제(delete)
    @DeleteMapping("/items/{id}")
    public String deleteItemById(@PathVariable String id) {
        items = items.stream()
                    .filter((item) -> !item.getId().equals(id))
                    .collect(Collectors.toList());
        return "Object with id =" + id + "has been deleted";
    }

    // 7. pathID와 Body로 업데이트(update)
    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody ItemBody itemBody) {

        Integer idInt = Integer.valueOf(id);
        ItemEntity itemEntity  = new ItemEntity(idInt, itemBody.getName(), itemBody.getType(),
                                itemBody.getPrice(), itemBody.getSpec().getCpu(),
                                itemBody.getSpec().getCapacity());

        ItemEntity itemEntityUpdated = electronicStoreItemRepository.updateItemEntity(idInt, itemEntity);

        Item itemUpdated = new Item(itemEntityUpdated);

        return itemUpdated;


        //        Item itemFounded = items.stream()
//                                .filter( (item) -> item.getId().equals(id) )
//                                .findFirst()
//                                .orElseThrow( () -> new RuntimeException()) ;
//
//        items.remove(itemFounded);
//
//        Item itemUpdated = new Item(Integer.valueOf(id), itemBody);
//        items.add(itemUpdated);


    }







}
