package telran.java2022.book.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Author;
import telran.java2022.book.model.Publisher;

public interface AuthorRepository {

	Optional<Author> findById(String authorName);

	void delete(Author author);

	Author save(Author author);

}
