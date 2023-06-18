package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizzamarket.services.OrderService;
import pl.wszib.pizzamarket.services.PizzaService;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;
import pl.wszib.pizzamarket.web.models.PizzaModel;

@Controller
public class OrersController {


    private final PizzaService pizzaService;
    private final OrderService orderService;

    public OrersController(PizzaService pizzaService, OrderService orderService) {
        this.pizzaService = pizzaService;
        this.orderService = orderService;
    }

    @GetMapping("order/{pizza-id}")
    public String orderdForm(@PathVariable("pizza-id")Long pizzaId, Model model){
        PizzaModel pizza = pizzaService.getById(pizzaId);
        model.addAttribute("orderAddresss" , new OrderAddressModel());
        model.addAttribute("pizza", pizza);

        return "orderPage";
    }
    @PostMapping("order/{pizza-id}")
    public String order(@PathVariable("pizza-id")Long pizzaId,
                        @ModelAttribute("orderAddress") OrderAddressModel orderAddressModel){
       orderService.seveOrder(pizzaId,orderAddressModel);

       return "orderConfirmationPage";
    }
}
