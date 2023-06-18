package pl.wszib.pizzamarket.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.pizzamarket.data.entities.OrderEntiety;

public interface OrderRopository extends JpaRepository<OrderEntiety, Long> {
}
