package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.OrderAdressEntity;
import pl.wszib.pizzamarket.data.entities.OrderEntiety;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.OrderRopository;
import pl.wszib.pizzamarket.data.repositories.PizzaRepo;
import pl.wszib.pizzamarket.web.mappers.OrderAddressMapper;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;

@Service
public class OrderService {
    private final OrderRopository orderRopository;
    private final PizzaRepo pizzaRepo;

    public OrderService(OrderRopository orderRopository, PizzaRepo pizzaRepo) {
        this.orderRopository = orderRopository;
        this.pizzaRepo = pizzaRepo;
    }
    @Transactional
    public void seveOrder(Long pizzaId, OrderAddressModel orderAddressModel){
        PizzaEntity pizzaEntity = pizzaRepo.findById(pizzaId).orElseThrow(EntityNotFoundException::new);
        OrderAdressEntity orderAdressEntity = OrderAddressMapper.toEntity(orderAddressModel);
        OrderEntiety orderEntiety = new OrderEntiety();
        orderEntiety.setPizzaName(pizzaEntity.getName());
        orderEntiety.setPrice(pizzaEntity.getPrice());
        orderEntiety.setOrderAdress(orderAdressEntity);

        orderRopository.save(orderEntiety);

    }
}
