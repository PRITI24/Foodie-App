package com.project.Foodie_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserInfo {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
}