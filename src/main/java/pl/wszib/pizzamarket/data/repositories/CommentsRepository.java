package pl.wszib.pizzamarket.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.pizzamarket.data.entities.CommentsEntity;

public interface CommentsRepository extends JpaRepository<CommentsEntity, Long> {
}
