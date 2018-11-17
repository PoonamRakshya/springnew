package com.cg.hotelbooking.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hotelbooking.dao.IBookingDAO;
import com.cg.hotelbooking.model.HotelDetails;

@Service
@Transactional
public class BookingServiceImpl implements IBookingService{

	@Autowired
	IBookingDAO bookingDao;
	
	@Override
	public ArrayList<HotelDetails> getAllHotels() {
		return bookingDao.getAllHotels();
	}

	@Override
	public String findHotelName() {
		return bookingDao.findHotelName();
	}

}
