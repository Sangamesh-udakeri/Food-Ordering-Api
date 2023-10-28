package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Delivery;
import com.project.model.Hotel;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

	public Delivery findByPartenerName(String partnerName);
}
