package OnlineShoppingApplication.Repository;
import OnlineShoppingApplication.model.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
    
    
}
