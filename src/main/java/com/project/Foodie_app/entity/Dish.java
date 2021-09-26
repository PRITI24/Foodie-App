package com.project.Foodie_app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Dish_Id;
	private int RestaurantId;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String Category;
	private String DishName;
	private float Price;
	private String Description;
	private Date AvailableDate;
	public int getDish_Id() {
		return Dish_Id;
	}
	public void setDish_Id(int dish_Id) {
		Dish_Id = dish_Id;
	}
	public int getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		RestaurantId = restaurantId;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDishName() {
		return DishName;
	}
	public void setDishName(String dishName) {
		DishName = dishName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(Date availableDate) {
		AvailableDate = availableDate;
	}
	public Dish(int dish_Id, int restaurantId, String category, String dishName, float price, String description,
			Date availableDate) {
		super();
		Dish_Id = dish_Id;
		RestaurantId = restaurantId;
		Category = category;
		DishName = dishName;
		Price = price;
		Description = description;
		AvailableDate = availableDate;
	}
	
	
}