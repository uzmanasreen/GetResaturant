package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.Collection;
import java.util.List;

import com.dailycodebuffer.Springboot.tutorial.entity.Restaurant;


public interface RestaurantService {
 
  public Restaurant saveRestaurant(Restaurant restaurant);

	
	  public List<Restaurant> fetchRestaurantList();
	  
	  public Collection<Restaurant> findRestaurantByName(String restaurantName) throws Exception;


	public Collection<Restaurant> findRestaurantByLocation(String restaurantLocation) throws Exception;


	public Collection<Restaurant> findRestaurantByDistance(String restaurantDistance)throws Exception; 

	  
	 // public Restaurant fetchRestaurantByName(String restaurantname);
	  
		/*
		 * public Restaurant fetchRestaurantByLocation(String restaurantname);
		 * 
		 * public Restaurant fetchRestaurantByDistance(String restaurantname);
		 * 
		 * 
		 * 
		 * //public void deleteRestaurantById(Long restaurantId);
		 * 
		 * public Restaurant updateRestaurant(Long restaurantId,Restaurant restaurant);
		 */
	 


}
