package telran.java2022.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Book;
import telran.java2022.book.model.Publisher;

public interface BookRepository  {
	Stream<Book> findByAuthorsName(String authorName);
	
	Stream<Book> findByPublisherPublisherName(String publisherName);

	boolean existsById(String isbn);

	Book save(Book book);

	Optional<Book> findById(String isbn);

	void deleteById(String isbn);

}
