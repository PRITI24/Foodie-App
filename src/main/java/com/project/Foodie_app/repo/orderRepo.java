package com.project.Foodie_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Foodie_app.entity.Order;

@Repository
public interface orderRepo extends JpaRepository<Order, Long>{
		
}

