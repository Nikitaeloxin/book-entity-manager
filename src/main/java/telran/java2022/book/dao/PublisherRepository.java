package telran.java2022.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Publisher;

public interface PublisherRepository{
	
//	@Query("select p.publisherName from Book b join b.authors a join b.publisher p where a.name=?1")
	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);

	Optional<Publisher> findById(String publisherName);

	Publisher save(Publisher publisher);
}
