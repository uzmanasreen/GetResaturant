package com.dailycodebuffer.Springboot.tutorial.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurant {
	@Id
	private Long restaurantId;
	private String restaurantName;
	private String restaurantDistance;
	private String restaurantLocation;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    List<RestaurantMenu> menu=new ArrayList<>();

	
    
}

