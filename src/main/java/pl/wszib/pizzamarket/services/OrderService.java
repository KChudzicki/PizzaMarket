package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.OrderAddressEntity;
import pl.wszib.pizzamarket.data.entities.OrderEntity;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.OrderRepository;
import pl.wszib.pizzamarket.data.repositories.PizzaRepo;
import pl.wszib.pizzamarket.web.mappers.OrderAddressMapper;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final PizzaRepo pizzaRepo;

    public OrderService(OrderRepository orderRepository, PizzaRepo pizzaRepo) {
        this.orderRepository = orderRepository;
        this.pizzaRepo = pizzaRepo;
    }
    @Transactional
    public void serveOrder(Long pizzaId, OrderAddressModel orderAddressModel){
        PizzaEntity pizzaEntity = pizzaRepo.findById(pizzaId).orElseThrow(EntityNotFoundException::new);
        OrderAddressEntity orderAdressEntity = OrderAddressMapper.toEntity(orderAddressModel);
        OrderEntity orderEntiety = new OrderEntity();
        orderEntiety.setPizzaName(pizzaEntity.getName());
        orderEntiety.setPrice(pizzaEntity.getPrice());
        orderEntiety.setOrderAddress(orderAdressEntity);

        orderRepository.save(orderEntiety);

    }
}
