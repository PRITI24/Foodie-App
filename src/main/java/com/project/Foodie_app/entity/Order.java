package com.project.Foodie_app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

	  	@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    int orderid;

	    private int restaurantId;
	    private String items;		//need to put list<dishes> here
	    private int totalPrice;
	    private long orderTime;
	    private String specialNote;

//	    private UserInfo userInfo;
//
//	    public UserInfo getUserInfo() {
//	        return userInfo;
//	    }
}