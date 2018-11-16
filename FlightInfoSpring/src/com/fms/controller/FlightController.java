package com.fms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fms.bean.FlightBean;
import com.fms.service.IFlightService;

@Controller
public class FlightController {
	@Autowired
	private IFlightService fserv;
	
	@RequestMapping("home")
	public ModelAndView viewAll(){
		ModelAndView mv=new ModelAndView();
		ArrayList<FlightBean> flist=fserv.getAllFlightInfo();
		mv.setViewName("home");
		mv.addObject("data", flist);
		return mv;
	}
	

}
