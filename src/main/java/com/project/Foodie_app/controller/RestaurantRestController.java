package com.project.Foodie_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Foodie_app.entity.Dish;
import com.project.Foodie_app.entity.Order;
import com.project.Foodie_app.entity.Restaurant;
import com.project.Foodie_app.repo.DishRepo;
import com.project.Foodie_app.repo.RestaurantRepo;
import com.project.Foodie_app.repo.orderRepo;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({ "/restaurant" })
@RestController
public class RestaurantRestController {

	@Autowired
	private RestaurantRepo registerRestaurantService;

	@Autowired
	private DishRepo Menu;
	
	@Autowired
	private orderRepo order;

	@PostMapping("/register")
	public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant){
		return ResponseEntity.ok(registerRestaurantService.save(restaurant));
	}	

	@PutMapping("/register")
	public ResponseEntity<Restaurant> add(@RequestBody Restaurant restaurant){
		return ResponseEntity.ok(registerRestaurantService.save(restaurant));
	}

	@GetMapping("/gell_All_restaurant")
	public ResponseEntity<List<Restaurant>> getAll()
	{
		return ResponseEntity.ok(registerRestaurantService.findAll());
	}

	@PutMapping("/addDish")
	public ResponseEntity<Dish> add(@RequestBody Dish dish) {
		return ResponseEntity.ok(Menu.save(dish));
	}
	
	@PostMapping("/addDish")
	public ResponseEntity<Dish> update(@RequestBody Dish dish) {
		return ResponseEntity.ok(Menu.save(dish));
	}
	
	@DeleteMapping("/deleteDish{id}")
	public ResponseEntity<Dish> delete(@PathVariable Long id) {
		Menu.findById(id).ifPresent(Menu::delete);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllorders()
	{
		return ResponseEntity.ok(order.findAll());
	}
	
	@DeleteMapping("/CancelOrder")
	public ResponseEntity<Dish> cancelOrder(@PathVariable Long id) {
		order.findById(id).ifPresent(order::delete);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/createorder")
	public ResponseEntity<Order> updateorder(@RequestBody Order orderv) {
		return ResponseEntity.ok(order.save(orderv));
	}

	@PutMapping("/createorder")
	public ResponseEntity<Order> addorder(@RequestBody Order orderv) {
		return ResponseEntity.ok(order.save(orderv));
	}
//	public ResponseEntity<List<Order>> findOrdersByRestaurantId(@PathVariable(value="id") int id){
//	Optional<Order> order= order.findById(id);
//	if(order.isPresent()) {
//		return ResponseEntity.ok().body(order.get());
//	}
//	else
//	{
//		return ResponseEntity.notFound().build();
//	}
//	}
}
