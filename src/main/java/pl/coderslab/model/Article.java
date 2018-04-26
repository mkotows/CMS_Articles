package pl.coderslab.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String title;

    @ManyToOne(cascade = CascadeType.MERGE)
    Author author;

    @OneToMany
    List<Category> categories;

    private String content;
    private LocalDate created;
    private LocalDate updated;



}
