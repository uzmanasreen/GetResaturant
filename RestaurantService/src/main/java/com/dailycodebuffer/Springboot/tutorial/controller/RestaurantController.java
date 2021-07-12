package com.dailycodebuffer.Springboot.tutorial.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.Springboot.tutorial.entity.Restaurant;
import com.dailycodebuffer.Springboot.tutorial.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	 @Autowired
	  private RestTemplate restTemplate;

	@PostMapping("/restaurants")
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.saveRestaurant(restaurant);
	}
	
	
	  @GetMapping("/restaurants") public List<Restaurant> fetchRestaurantList(){
	  return restaurantService.fetchRestaurantList();
	  }
	  
	  @GetMapping("/restaurants/{restaurantName}") 
	  public Collection<Restaurant> findRestaurantByName(@PathVariable ("restaurantName") String restaurantName)
	  throws Exception 
	  { return restaurantService.findRestaurantByName(restaurantName);
	  
	  }
	  
	  @GetMapping("/restaurantsLocation/{restaurantLocation}")
	  public Collection<Restaurant> findRestaurantByLocation(@PathVariable ("restaurantLocation") String restaurantLocation) throws Exception { 
		  return restaurantService.findRestaurantByLocation(restaurantLocation);
	  
	  }
	  
	  @GetMapping("/restaurantsDistance/{restaurantDistance}") 
	  public Collection<Restaurant> findRestaurantByDistance(@PathVariable ("restaurantDistance") String restaurantDistance) throws Exception
	  { 
		  return restaurantService.findRestaurantByDistance(restaurantDistance);
	  
	  }
	  
	  @GetMapping("/restaurantsmenuslist/{restaurantId}")
	    public Restaurant getRestaurant(@PathVariable("restaurantId") Long restaurantId) {
		  Restaurant restaurant = this.getRestaurant(restaurantId);
	        List menu = this.restTemplate.getForObject("http://localhost:9002/restaurantsmenu/restaurants" + restaurant.getRestaurantId(), List.class);

	        restaurant.setMenu(menu);
	        return restaurant;

}
}
	 
	/*
	 * @DeleteMapping("/departments/{id}") public String
	 * deleteRestaurantById(@PathVariable("id") Long restaurantId) {
	 * restaurantService.deleteRestaurantById(restaurantId); return
	 * "Restaurant Deleted successfully";
	 * 
	 * }
	 * 
	 * 
	 * @PutMapping("/restaurants/{id}") public Restaurant
	 * updateRestaurant(@PathVariable("id") Long restaurantId,@RequestBody
	 * Restaurant restaurant ) { return
	 * restaurantService.updateRestaurant(restaurantId,restaurant); }
	 * 
	 * }
	 */