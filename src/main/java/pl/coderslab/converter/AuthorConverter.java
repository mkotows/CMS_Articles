package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.coderslab.model.Author;
import pl.coderslab.repository.AuthorRepository;

@Component
public class AuthorConverter implements Converter<String,Author> {

    @Autowired
    AuthorRepository authorRepository;

    public AuthorConverter() {
    }

    @Override
    public Author convert(String source) {
        Author author = authorRepository.findOne(Long.parseLong(source));
        return author;
    }
}
