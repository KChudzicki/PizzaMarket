package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.CommentsEntity;
import pl.wszib.pizzamarket.web.models.CommentsModel;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;

public class CommentsMapper {

    public static CommentsModel toModel(CommentsEntity entity) {
        return new CommentsModel(
                entity.getId(),
                entity.getName(),
                entity.getComment()
        );
    }

}
