package controller;

import com.google.gson.Gson;
import entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RestaurantService;

/**
 * Created by antonio on 02/01/2018.
 */
@CrossOrigin("*")
@RestController
public class RestaurantController {


    private Gson gson = new Gson();


    @Autowired
    RestaurantService restaurantService;

    @PostMapping("/save")
    public String save(@RequestBody Restaurant restaurant) {

       // this.restaurantService.save();

        restaurant.setName("le cambiamos el nombre asi nomas quedo");
        String ret = gson.toJson(restaurant);

        return  gson.toJson(restaurant);
    }
}
