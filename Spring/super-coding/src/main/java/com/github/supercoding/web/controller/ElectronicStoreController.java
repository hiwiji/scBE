package com.github.supercoding.web.controller;

import com.github.supercoding.service.ElectronicStoreItemService;
import com.github.supercoding.web.dto.items.BuyOrder;
import com.github.supercoding.web.dto.items.Item;
import com.github.supercoding.web.dto.items.ItemBody;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Electronic Store Controller API", description = "컨트롤러에 대한 설명입니다.")

public class ElectronicStoreController {

    private final ElectronicStoreItemService electronicStoreItemService;

    //private static int serialItemId = 1;

    // db가 연결되어 있지 않아 list로 db 데이터값 만들어주기
//    private List<Item> items = new ArrayList<>(Arrays.asList(
//            new Item(String.valueOf(serialItemId++), "Apple iPhone 12 Pro Max", "Smartphone", 1490000, "A14 Bionic", "512GB"),
//            new Item(String.valueOf(serialItemId++), "Samsung Galaxy S21 Ultra", "Smartphone", 1690000, "Exynos 2100", "256GB"),
//            new Item(String.valueOf(serialItemId++), "Google Pixel 6 Pro", "Smartphone", 1290000, "Google Tensor", "128GB"),
//            new Item(String.valueOf(serialItemId++), "Dell XPS 15", "Laptop", 2290000, "Intel Core i9", "1TB SSD"),
//            new Item(String.valueOf(serialItemId++), "Sony Alpha 7 III", "Mirrorless Camera", 2590000, "BIONZ X", "No internal storage"),
//            new Item(String.valueOf(serialItemId++), "Microsoft Xbox Series X", "Gaming Console", 499000, "Custom AMD Zen 2", "1TB SSD")
//    ));

    // 로거 설정
    //private final Logger logger = LoggerFactory.getLogger(this.getClass());
    // 이름은 대부분 자신의 클래스 이름을 써서 this로  함. log

    // 1. 모든 아이템 조회(get)
    //@ApiOperation("모든 Item을 검색")
    @Operation(summary = "모든 Item을 검색 오퍼", description = "뭐야 이거 이상해")
    @GetMapping("/items")
    public List<Item> findAllItem() {
        log.info("GET/items 요청이 들어왔습니다.");
        List<Item> items =  electronicStoreItemService.findAllItem();
        log.info("GET/items 응답 : " + items);
        return items;
    }

    // 2. 새로운 아이템 등록(post)
    @ApiOperation("모든 Item 등록")
    @PostMapping("/items")
    public String registerItem(@RequestBody ItemBody itemBody) {
        Integer itemId = electronicStoreItemService.saveItem(itemBody);
        return "ID : " + itemId;
    }

    // 3. ID Path로 아이템 조회(get)
    @ApiOperation("모든 Item id로 검색")
    @GetMapping("/items/{id}")
    public Item findItemByPathId(@PathVariable String id) {
        return electronicStoreItemService.findItemById(id);
    }

    // 4. 쿼리 파라미터로 ID 조회
    @ApiOperation("모든 Item을 검색 (쿼리문)")
    @GetMapping("/items-query")
    public Item findItemByQueryId(@RequestParam("id") String id) {
        return electronicStoreItemService.findItemById(id);
    }

    // 5.여러개의 ID쿼리 파라미터로 조회
    @ApiOperation("모든 Item을 ids로 검색 (쿼리문) ")
    @GetMapping("/items-queries")
    public List<Item> findItemByQueryIds(@RequestParam("id") List<String> ids) {
        log.info("/items-queries 요청 ids: " + ids);
        List<Item> items =  electronicStoreItemService.findItemsByIds(ids);
        log.info("/items-queries 응답 :" + items);
        return items;
    }

    // 6. path ID로 아이템 삭제(delete)
    @ApiOperation("모든 Item ids로 삭제")
    @DeleteMapping("/items/{id}")
    public String deleteItemById(@PathVariable String id) {
        electronicStoreItemService.deleteItem(id);
        return "Object with id =" + id + "has been deleted";
    }

    // 7. pathID와 Body로 업데이트(update)
    @ApiOperation("모든 Item ids로 수정")
    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody ItemBody itemBody) {
        return electronicStoreItemService.updateItem(id, itemBody);

    }
    @ApiOperation("모든 Item 구매")
    @PostMapping("/items/buy")
    public String buyItem(@RequestBody BuyOrder buyOrder) {
        Integer orderItemNums = electronicStoreItemService.buyItems(buyOrder);

        return "요청하신 Item 중 " + orderItemNums + "개를 구매하였습니다.";
    }
}
