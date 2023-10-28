package com.project.service;

import java.util.List;

import com.project.model.Delivery;

public interface DeliveryService {

	Delivery getDeliveryById(int id);
	Delivery getDeliveryByPartener(String partnerName);
	void updataDelivery(Delivery delivery);
	void deleteDelivery(int deliveryId);
}
