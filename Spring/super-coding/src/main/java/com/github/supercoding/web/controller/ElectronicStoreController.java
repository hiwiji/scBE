package com.github.supercoding.web.controller;

import com.github.supercoding.service.ElectronicStoreItemService;
import com.github.supercoding.web.dto.BuyOrder;
import com.github.supercoding.web.dto.Item;
import com.github.supercoding.web.dto.ItemBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ElectronicStoreController {

    private ElectronicStoreItemService electronicStoreItemService;

    public ElectronicStoreController(ElectronicStoreItemService electronicStoreItemService) {
        this.electronicStoreItemService = electronicStoreItemService;
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
        return electronicStoreItemService.findAllItem();
    }

    // 2. 새로운 아이템 등록(post)

    @PostMapping("/items")
    public String registerItem(@RequestBody ItemBody itemBody) {
        Integer itemId = electronicStoreItemService.saveItem(itemBody);

        return "ID : " + itemId;
    }

    // 3. ID Path로 아이템 조회(get)
    @GetMapping("/items/{id}")
    public Item findItemByPathId(@PathVariable String id) {
        return electronicStoreItemService.findItemById(id);
    }

    // 4. 쿼리 파라미터로 ID 조회
    @GetMapping("/items-query")
    public Item findItemByQueryId(@RequestParam("id") String id) {
        return electronicStoreItemService.findItemById(id);
    }

    // 5.여러개의 ID쿼리 파라미터로 조회
    @GetMapping("/items-queries")
    public List<Item> findItemByQueryIds(@RequestParam("id") List<String> ids) {
        return electronicStoreItemService.findItemsByIds(ids);
    }

    // 6. path ID로 아이템 삭제(delete)
    @DeleteMapping("/items/{id}")
    public String deleteItemById(@PathVariable String id) {
        electronicStoreItemService.deleteItem(id);
        return "Object with id =" + id + "has been deleted";
    }

    // 7. pathID와 Body로 업데이트(update)
    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody ItemBody itemBody) {
        return electronicStoreItemService.updateItem(id, itemBody);

    }

    @PostMapping("/items/buy")
    public String buyItem(@RequestBody BuyOrder buyOrder) {
        Integer orderItemNums = electronicStoreItemService.buyItems(buyOrder);

        return "요청하신 Item 중 " + orderItemNums + "개를 구매하였습니다.";
    }



}
