package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.Restaurant;
import com.dailycodebuffer.Springboot.tutorial.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	
	  @Override public List<Restaurant> fetchRestaurantList() { 
		  return restaurantRepository.findAll(); 
	  }
	  
	  
	  @Override 
	  public Collection<Restaurant> findRestaurantByName(String name) throws Exception { 
	      return restaurantRepository.findRestaurantByName(name); 
	  }


	@Override
	public Collection<Restaurant> findRestaurantByLocation(String Location) throws Exception {
		return restaurantRepository.findRestaurantByLocation(Location);
	}


	@Override
	public Collection<Restaurant> findRestaurantByDistance(String Distance) throws Exception {
		return restaurantRepository.findRestaurantByDistance(Distance);
	} 
	  
	/*
	 * @Override public Restaurant fetchRestaurantByName(String restaurantname) {
	 * return restaurantRepository.fetchRestaurantByName(restaurantname).get(); }
	 */
	  
	  
	/*
	 * @Override public void deleteRestaurantById(Long restaurantId) {
	 * restaurantRepository.deleteById(restaurantId);
	 * 
	 * }
	 * 
	 * 
	 * @Override public Restaurant updateRestaurant(Long restaurantId, Restaurant
	 * restaurant) { Restaurant depDB =
	 * restaurantRepository.findById(restaurantId).get();
	 * 
	 * if(Objects.nonNull(restaurant.getRestaurantName())&&
	 * !"".equalsIgnoreCase(restaurant.getRestaurantName())) {
	 * depDB.setRestaurantName(restaurant.getRestaurantName()); }
	 * if(Objects.nonNull(restaurant.getRestaurantCode())&&
	 * !"".equalsIgnoreCase(restaurant.getRestaurantCode())) {
	 * depDB.setRestaurantCode(restaurant.getRestaurantCode()); }
	 * 
	 * if(Objects.nonNull(restaurant.getRestaurantAddress())&&
	 * !"".equalsIgnoreCase(restaurant.getRestaurantAddress())) {
	 * depDB.setRestaurantAddress(restaurant.getRestaurantAddress()); } return
	 * restaurantRepository.save(depDB) ; }
	 */

}
