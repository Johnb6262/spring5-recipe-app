package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author John Bickerstaff
 * 21/08/2020
 */
public abstract class CategoryRepository implements CrudRepository<Category,Long> {
}
