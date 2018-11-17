package com.cg.hotelbooking.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.hotelbooking.model.HotelDetails;

@Repository
public class BookingDAOImpl implements IBookingDAO {

	@PersistenceContext
	EntityManager manager;

	@Override
	public ArrayList<HotelDetails> getAllHotels() {
		ArrayList<HotelDetails> list = new ArrayList<>();
		String jpql = "Select hotel from HotelDetails hotel";
		TypedQuery<HotelDetails> query = manager.createQuery(jpql, HotelDetails.class);
		list = (ArrayList<HotelDetails>) query.getResultList();
		return list;
	}

	@Override
	public String findHotelName() {
		String jpql ="Select hotel.name from HotelDetails hotel where hotel.id = 1";
		TypedQuery<String> query = manager.createQuery(jpql,String.class);
		String hotelName = query.getSingleResult();
		return hotelName;
	}
}
