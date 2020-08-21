package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author John Bickerstaff
 * 21/08/2020
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
