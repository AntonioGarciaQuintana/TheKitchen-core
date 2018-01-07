package service;

import entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RestaurantRepository;

/**
 * Created by antonio on 03/01/2018.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
   RestaurantRepository restaurantRepository;

    @Override
    public void save() {
        Restaurant restaurant = new Restaurant();

        Restaurant consulta = null;
        consulta = restaurantRepository.getById(2L);

        restaurant.setName("sushilito");
        this.restaurantRepository.save(restaurant);
    }
}
