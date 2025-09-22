package OnlineShoppingApplication.repository;
import OnlineShoppingApplication.model.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
    
    
}
