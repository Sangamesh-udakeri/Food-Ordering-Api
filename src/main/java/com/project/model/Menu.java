package com.project.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

	@Id
	@GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "menu_id", sequenceName = "menu_id")
	private Integer menuId;
	private String menuName;
	private Double price;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;

	public Menu(String menuName, Double price) {
		super();
		this.menuName = menuName;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", price=" + price + ", hotel=" + hotel + "]";
	}
}
