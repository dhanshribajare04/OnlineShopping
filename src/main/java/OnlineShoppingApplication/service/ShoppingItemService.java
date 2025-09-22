package OnlineShoppingApplication.service;

import OnlineShoppingApplication.model.ShoppingItem;
import java.util.List;

public interface ShoppingItemService {
    // get all items
    List<ShoppingItem> getAllItems();

    // add new item
    ShoppingItem addItem(ShoppingItem item);

    
}
