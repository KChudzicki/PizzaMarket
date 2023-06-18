package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.CommentsEntity;
import pl.wszib.pizzamarket.web.models.CommentsModel;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;

public class CommentSaveMapper {
    public static CommentsEntity toEntity(CommentsSaveModel model){
        CommentsEntity entity = new CommentsEntity();
        entity.setName(model.getName());
        entity.setComment(model.getComment());
        return entity;
    }
}
