package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by KSE on 02.03.2021 0:00
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
