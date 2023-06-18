package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.PizzaRepo;
import pl.wszib.pizzamarket.web.mappers.PizzaMapper;
import pl.wszib.pizzamarket.web.models.PizzaModel;

import java.util.List;

@Service
public class PizzaService {

     private final PizzaRepo pizzaRepo;

    public PizzaService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }


    public List<PizzaModel> findAll(){
        List<PizzaEntity> entities = pizzaRepo.findAll();

        return entities.stream().
                map(PizzaMapper::toModel)
                .toList();


    }

    public PizzaModel getById(Long pizzaId) {
       PizzaEntity pizzaEntity = pizzaRepo.findById(pizzaId).orElseThrow(EntityNotFoundException::new);

        return PizzaMapper.toModel(pizzaEntity);
    }
}
