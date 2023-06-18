package pl.wszib.pizzamarket.data.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
public class OrderEntiety {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "pizza_name")
    private String pizzaName;
    @Column(name = "price")
    private BigDecimal price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_address_id")
    private     OrderAdressEntity orderAdress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderAdressEntity getOrderAdress() {
        return orderAdress;
    }

    public void setOrderAdress(OrderAdressEntity orderAdress) {
        this.orderAdress = orderAdress;
    }
}
