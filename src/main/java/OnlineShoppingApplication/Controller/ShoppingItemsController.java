package OnlineShoppingApplication.controller;


import org.springframework.web.bind.annotation.RestController;

import OnlineShoppingApplication.dto.ApiResponse;
import OnlineShoppingApplication.model.ShoppingItem;
import OnlineShoppingApplication.repository.ShoppingItemRepository;
import OnlineShoppingApplication.service.ShoppingItemService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/v1")
public class ShoppingItemsController {


     private final ShoppingItemService shoppingItemService;

    //Constructor Injection
    public ShoppingItemsController(ShoppingItemService shoppingItemService) {
        this.shoppingItemService = shoppingItemService;
    } 
    // @Autowired
    // private ShoppingItemRepository shoppingItemsRepository;
    // private ShoppingItemService shoppingItemService;

    @GetMapping("/items")
    public String getItems() {
        return "✅ API is working: Get all items";
    }

      @PostMapping("/items")
    public ResponseEntity<ApiResponse<ShoppingItem>> addItem(@RequestBody ShoppingItem item) {
        ShoppingItem savedItem = shoppingItemService.addItem(item);
        ApiResponse<ShoppingItem> response = new ApiResponse<>(true, savedItem, null);
        return ResponseEntity.ok(response);
    }
    
}
