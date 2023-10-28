package com.project.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@Id
	@GeneratedValue(generator = "address_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="address_id",sequenceName = "address_id")
	private Integer addressId;
	private String  city;
	private Long    zipCode;
	private String  streetName;
	private String  state;
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + ", streetName=" + streetName + ", state=" + state
				+ "]";
	}
	public Address(String city, Long zipCode, String streetName, String state) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.streetName = streetName;
		this.state = state;
	}
}
