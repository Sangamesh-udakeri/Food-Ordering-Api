package com.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.model.Address;
import com.project.model.Delivery;
import com.project.model.Hotel;
import com.project.model.Menu;
import com.project.service.DeliveryService;
import com.project.service.HotelService;

@SpringBootApplication
public class FoodOrderingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingApiApplication.class, args);
	}

	

}
