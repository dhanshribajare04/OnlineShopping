package OnlineShoppingApplication.Services;
 
import OnlineShoppingApplication.Repository.ShoppingItemRepository;
import OnlineShoppingApplication.model.ShoppingItem;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired; 

public class OnlineShoppingServices {
    @Autowired
    private ShoppingItemRepository shoppingItemsRepository;

    // get all items
    public List<ShoppingItem> getAllItems() {
        return shoppingItemsRepository.findAll();
    }

    // // get item by id
    // public Optional<ShoppingItems> getItemById(Long id) {
    //     return shoppingItemsRepository.findById(id);
    // }

    // // add new item
    // public ShoppingItems addItem(ShoppingItems item) {
    //     return shoppingItemsRepository.save(item);
    // }

    // // update item
    // public ShoppingItems updateItem(Long id, ShoppingItems item) {
    //     item.setId(id);
    //     return shoppingItemsRepository.save(item);
    // }

    // // delete item
    // public void deleteItem(Long id) {
    //     shoppingItemsRepository.deleteById(id);
    // }
    
}
