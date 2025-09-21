package OnlineShoppingApplication.Controller;


import org.springframework.web.bind.annotation.RestController;

import OnlineShoppingApplication.Repository.ShoppingItemRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/v1")
public class ShoppingItemsController {

    @GetMapping("/items")
    public String getItems() {
        return "✅ API is working: Get all items";
    }
}
