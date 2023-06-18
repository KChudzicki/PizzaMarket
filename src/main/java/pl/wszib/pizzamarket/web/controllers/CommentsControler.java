package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizzamarket.services.CommentsService;
import pl.wszib.pizzamarket.web.models.CommentsModel;
import pl.wszib.pizzamarket.web.models.CommentsSaveModel;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;
import pl.wszib.pizzamarket.web.models.PizzaModel;

import java.util.List;

@Controller
public class CommentsControler {
    private final CommentsService commentsService;

    public CommentsControler(CommentsService commentsService) {
        this.commentsService = commentsService;
    }


    @GetMapping("comments")
    public String CommentsPage(Long commentId,Model model) {
        List<CommentsModel> comments = commentsService.findAll();
//        CommentsModel commentsSaveModel = commentsService.getById(commentId);
        model.addAttribute("newComment", new CommentsSaveModel());
        model.addAttribute("coments", comments);
//        model.addAttribute("comentsSave", commentsSaveModel);
        return "commentsPage";
    }
    @PostMapping("comments")
    public String comment(Long commentsId,@ModelAttribute("comments") CommentsSaveModel commentsSaveModel ){
        commentsService.saveComment(commentsId,commentsSaveModel);

        return "commentsPage";
    }

}

