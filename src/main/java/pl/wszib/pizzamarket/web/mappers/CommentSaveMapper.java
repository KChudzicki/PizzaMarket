package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.CommentsEntity;
import pl.wszib.pizzamarket.web.models.CommentsModel;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;

public class CommentSaveMapper {
    public static CommentsEntity toEntity(CommentsSaveModel model){
        CommentsEntity commentsEntity = new CommentsEntity();
        commentsEntity.setName(model.getName());
        commentsEntity.setComment(model.getComment());
        return commentsEntity;
    }
}
