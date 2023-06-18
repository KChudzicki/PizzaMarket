package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import pl.wszib.pizzamarket.data.entities.CommentsEntity;
import pl.wszib.pizzamarket.data.repositories.CommentsRepository;
import pl.wszib.pizzamarket.web.mappers.CommentSaveMapper;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;

public class CommentsSaveService {

    private  final CommentsRepository commentsRepository;

    public CommentsSaveService(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }


}
