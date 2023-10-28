package com.project.service;

import java.util.List;

import com.project.model.Hotel;

public interface HotelService {

	Hotel addHotel(Hotel hotel);
	Hotel updateHotel(Hotel hotel);
	Hotel getHotel(Integer id);
	void deleteHotel(Integer id);
	List<Hotel>getHotelsByCity(String city);
	List<Hotel>getHotelsByLocation(String location);
	List<Hotel>getHotelsByMenu(String menuName);
	
	List<Hotel>getHotelsByDelivery(String partenerName);
	List<Hotel>getHotelsByLocationAndMenu(String location,String menuName);
}
