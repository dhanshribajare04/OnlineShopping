package OnlineShoppingApplication.service.impl;

import OnlineShoppingApplication.model.ShoppingItem;
import OnlineShoppingApplication.repository.ShoppingItemRepository;
import OnlineShoppingApplication.service.ShoppingItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingItemServiceImpl implements ShoppingItemService {


    private final ShoppingItemRepository shoppingItemRepository;

    // ✅ constructor injection
    public ShoppingItemServiceImpl(ShoppingItemRepository shoppingItemRepository) {
        this.shoppingItemRepository = shoppingItemRepository;
    }
    
    // @Autowired
    // private ShoppingItemRepository shoppingItemRepository;

    @Override
    public List<ShoppingItem> getAllItems() {
        return shoppingItemRepository.findAll();
    }

    @Override
    public ShoppingItem addItem(ShoppingItem item) {

        return shoppingItemRepository.save(item);
    }
}
