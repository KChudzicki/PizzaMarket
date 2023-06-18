package pl.wszib.pizzamarket.data.entities;

import jakarta.persistence.*;
import org.apache.juli.logging.Log;

@Entity
@Table(name = "order_adresses")
public class OrderAdressEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "street")
    private String street;
    @Column(name = "postal_code")
    private String postalColde;
    @Column(name = "city")
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalColde() {
        return postalColde;
    }

    public void setPostalColde(String postalColde) {
        this.postalColde = postalColde;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
