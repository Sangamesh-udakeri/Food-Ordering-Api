package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Delivery;
import com.project.repository.DeliveryRepository;
@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public Delivery getDeliveryById(int id) {
		return deliveryRepository.findById(id).get();
	}

	@Override
	public Delivery getDeliveryByPartener(String partnerName) {
		return deliveryRepository.findByPartenerName(partnerName);
	}

	@Override
	public void updataDelivery(Delivery delivery) {

		deliveryRepository.save(delivery);
	}

	@Override
	public void deleteDelivery(int id) {
		deliveryRepository.deleteById(id);
	}

}
