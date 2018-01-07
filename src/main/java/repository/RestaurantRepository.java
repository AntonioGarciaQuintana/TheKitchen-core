package repository;

import entity.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by antonio on 03/01/2018.
 */
@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    @Query(
            "SELECT R FROM Restaurant R " +
                    "WHERE R.id = :id"
    )
    Restaurant getById(@Param("id") Long id);
}
