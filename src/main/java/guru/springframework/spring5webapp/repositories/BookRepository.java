package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by KSE on 01.03.2021 23:02
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
