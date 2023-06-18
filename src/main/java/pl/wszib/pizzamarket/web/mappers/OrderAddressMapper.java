package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OrderAdressEntity;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;

public class OrderAddressMapper {
    public static OrderAdressEntity toEntity(OrderAddressModel model){
        OrderAdressEntity entity = new OrderAdressEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setStreet(model.getStreet());
        entity.setPostalColde(model.getPostalColde());
        entity.setCity(model.getCity());

        return entity;
    }
}
