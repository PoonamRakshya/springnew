package com.cg.hotelbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteldetails")
public class HotelDetails {

	@Id
	private Integer id;
	private String name;
	private String rating;
	private Integer rate;
	private Integer availablerooms;

	public HotelDetails() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Integer getAvailablerooms() {
		return availablerooms;
	}

	public void setAvailablerooms(Integer availablerooms) {
		this.availablerooms = availablerooms;
	}

	public HotelDetails(Integer id, String name, String rating, Integer rate, Integer availablerooms) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.rate = rate;
		this.availablerooms = availablerooms;
	}

}
