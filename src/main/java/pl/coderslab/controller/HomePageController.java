package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Article;
import pl.coderslab.repository.ArticleRepository;
import pl.coderslab.repository.AuthorRepository;
import pl.coderslab.repository.CategoryRepository;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/hello")
    public String hello (Model model){

        List<Article> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
        return "hello";

//        StringBuilder sb = new StringBuilder();
//        for (Article article: list){
//            sb.append(article +"<br>");
//        }
//        return sb.toString();
    }




}
