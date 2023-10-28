package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {

	List<Hotel> findByAddressCity(String city);

	List<Hotel> findByAddressStreetName(String location);

	@Query("SELECT h FROM Hotel h JOIN h.menuList m WHERE m.menuName = :menuName")
	List<Hotel> getHotelsByMenu(String menuName);
	
	@Query("SELECT h FROM Hotel h INNER JOIN h.delivary d WHERE d.partenerName = :partnerName")
	List<Hotel> getHotelByDelivery(@Param("partnerName") String partnerName);

	@Query("SELECT h FROM Hotel h INNER JOIN h.address a INNER JOIN h.menuList mn WHERE a.streetName = :location AND mn.menuName = :menuName")
	List<Hotel> getHotelsByLocationAndMenu(@Param("location") String location, @Param("menuName") String menuName);

	
}
