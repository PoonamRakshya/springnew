package com.cg.hotelbooking.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.hotelbooking.model.HotelDetails;
import com.cg.hotelbooking.service.IBookingService;

@Controller
public class MainController {

	@Autowired
	IBookingService service;

	@RequestMapping("/home")
	public String displayPage(Model model) {
		String view = "HotelDetails";
		ArrayList<HotelDetails> list = service.getAllHotels();
		model.addAttribute("hotellist", list);
		return view;
	}

	@RequestMapping("/booking")
	public String bookingPage(Model model) {
		String view = "";
		String hotelName = service.findHotelName();
		model.addAttribute("hotelname", hotelName);
		view = "BookingConfirmation";
		return view;
	}
}
