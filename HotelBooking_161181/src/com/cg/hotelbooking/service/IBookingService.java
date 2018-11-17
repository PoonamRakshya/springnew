package com.cg.hotelbooking.service;

import java.util.ArrayList;

import com.cg.hotelbooking.model.HotelDetails;

public interface IBookingService {

	public ArrayList<HotelDetails> getAllHotels();

	public String findHotelName();

}
