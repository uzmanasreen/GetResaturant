package com.dailycodebuffer.Springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RestaurantMenu {
	@Id
	private Long MenuId;
    private String Itemname;
    private int price;
 
    
    @ManyToOne
	private Restaurant restaurant;

}
