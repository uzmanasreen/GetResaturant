package com.dailycodebuffer.Springboot.tutorial.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
	
	  @Query(value = "SELECT r FROM Restaurant r where LOWER(r.restaurantName) = LOWER(:restaurantName)") 
	  Collection<Restaurant> findRestaurantByName(@Param("restaurantName") String restaurantName)throws Exception;
	  
	  
	  @Query(value = "SELECT r FROM Restaurant r where LOWER(r.restaurantLocation) = LOWER(:restaurantLocation)") 
      Collection<Restaurant> findRestaurantByLocation(@Param("restaurantLocation")String restaurantLocation)throws Exception;

	  @Query(value = "SELECT r FROM Restaurant r where LOWER(r.restaurantDistance) = LOWER(:restaurantDistance)") 
      Collection<Restaurant> findRestaurantByDistance(@Param("restaurantDistance") String restaurantDistance)throws Exception;
	 
	
     }
