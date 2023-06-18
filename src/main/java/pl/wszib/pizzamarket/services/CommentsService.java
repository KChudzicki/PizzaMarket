package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.CommentsEntity;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.CommentsRepository;
import pl.wszib.pizzamarket.web.mappers.CommentSaveMapper;
import pl.wszib.pizzamarket.web.mappers.CommentsMapper;
import pl.wszib.pizzamarket.web.mappers.PizzaMapper;
import pl.wszib.pizzamarket.web.models.CommentsModel;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;
import pl.wszib.pizzamarket.web.models.PizzaModel;

import java.util.List;

@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;

    public CommentsService(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    public List<CommentsModel> findAll() {
        List<CommentsEntity> entities = commentsRepository.findAll();

        return entities.stream().
                map(CommentsMapper::toModel)
                .toList();


    }


    public CommentsModel getById(Long commentId) {
        CommentsEntity commentsEntity = commentsRepository.findById(commentId).orElseThrow(EntityNotFoundException::new);

        return CommentsMapper.toModel(commentsEntity);
    }
    public void saveComment(Long commentsId, CommentsSaveModel commentsSaveModel) {
        CommentsEntity commentsEntity1 = commentsRepository.findById(commentsId).orElseThrow(EntityNotFoundException::new);
        CommentsEntity commentsEntity = CommentSaveMapper.toEntity(commentsSaveModel);
        CommentsEntity comment = new CommentsEntity();
        comment.setName(commentsEntity.getName());
        comment.setComment(commentsEntity.getComment());

        commentsRepository.save(commentsEntity);

    }
}