package com.project.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {

	@Id
	@GeneratedValue(generator = "del_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="del_id",sequenceName = "del_id")
	private Integer deliveryId;
	private String  partenerName;
	private Double  charges;
	@JsonIgnore
	@ManyToMany(mappedBy = "delivary")
	private Set<Hotel> hotels=new HashSet<>();
	@Override
	public String toString() {
		return "Delivery [partenerName=" + partenerName + ", charges=" + charges + ", hotels=" + hotels + "]";
	}
	public Delivery(String partenerName, Double charges) {
		super();
		this.partenerName = partenerName;
		this.charges = charges;
	}
}
