package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Hotel;
import com.project.service.HotelService;
import com.project.service.HotelServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class HotelController {

	@Autowired
	HotelServiceImpl hotelService;

	@PostMapping("/addhotel")
	public ResponseEntity<Hotel> addHotel(@org.springframework.web.bind.annotation.RequestBody  Hotel hotel) {
		Hotel hotel1=new Hotel();
		hotel1.setDelivary(hotel.getDelivary());
		hotel1.setMenuList(hotel.getMenuList());
		Hotel addHotel = hotelService.addHotel(hotel);
		return new ResponseEntity<Hotel>(addHotel, HttpStatus.OK);
	}
	@GetMapping("/getHotel/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable int id) {
		Hotel getHotel = hotelService.getHotel(id);
		return new ResponseEntity<Hotel>(getHotel, HttpStatus.OK);
	}
	@GetMapping("/hotel-city/{city}")
	public ResponseEntity<List<Hotel>> getHotelByCity(@PathVariable String city){
		List<Hotel> hotelsByCity = hotelService.getHotelsByCity(city);
		return new ResponseEntity<List<Hotel>>(hotelsByCity, HttpStatus.OK);
	}
	
	@GetMapping("/hotel-location/{location}")
	public ResponseEntity<List<Hotel>> getHotelByLocation(@PathVariable String location){
		List<Hotel> hotelsByLocation = hotelService.getHotelsByLocation(location);
		return new ResponseEntity<List<Hotel>>(hotelsByLocation, HttpStatus.OK);
	}
	
	@GetMapping("/hotel-menu/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelByMenu(@PathVariable String menuName){
		List<Hotel> hotelsByMenu = hotelService.getHotelsByMenu(menuName);
		return new ResponseEntity<List<Hotel>>(hotelsByMenu, HttpStatus.OK);
	}
	
	
	@GetMapping("/hotel-Delivery/{partnerName}")
	public ResponseEntity<List<Hotel>> getHotelByDelivery(@PathVariable String partnerName){
		List<Hotel> hotelsByDelivery = hotelService.getHotelsByDelivery(partnerName);
		return new ResponseEntity<List<Hotel>>(hotelsByDelivery, HttpStatus.OK);
	}
	
	@GetMapping("/hotel-locationandmenu/{location}/{menuName}")
	public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable String location,@PathVariable String menuName){
		List<Hotel> hotelsByMenuAndLocation = hotelService.getHotelsByLocationAndMenu(location,menuName);
		return new ResponseEntity<List<Hotel>>(hotelsByMenuAndLocation, HttpStatus.OK);
	}
	
}
