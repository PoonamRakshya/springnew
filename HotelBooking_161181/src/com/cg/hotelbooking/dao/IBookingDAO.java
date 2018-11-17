package com.cg.hotelbooking.dao;

import java.util.ArrayList;

import com.cg.hotelbooking.model.HotelDetails;

public interface IBookingDAO {
	public ArrayList<HotelDetails> getAllHotels();

	public String findHotelName();
}
