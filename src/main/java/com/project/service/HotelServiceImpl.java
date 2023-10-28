package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Hotel;
import com.project.model.Menu;
import com.project.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotel(Integer id) {
		return hotelRepository.findById(id).get();
	}

	@Override
	public void deleteHotel(Integer id) {
		hotelRepository.deleteById(id);
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		return hotelRepository.findByAddressCity(city);
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		return hotelRepository.getHotelsByMenu(menuName);
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partenerName) {
		return hotelRepository.getHotelByDelivery(partenerName);
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		return hotelRepository.findByAddressStreetName(location);
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		return hotelRepository.getHotelsByLocationAndMenu(location,menuName);
	}

}
