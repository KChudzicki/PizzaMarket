package pl.wszib.pizzamarket.web.models;

public class OrderAddressModel {

    private String firstName;
    private String lastName;
    private String street;
    private String postalColde;
    private String city;

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
