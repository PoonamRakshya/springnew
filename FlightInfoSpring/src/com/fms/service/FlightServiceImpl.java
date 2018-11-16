package com.fms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.bean.FlightBean;
import com.fms.dao.IFlightDao;
@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	private IFlightDao fdao;

	@Override
	public ArrayList<FlightBean> getAllFlightInfo() {
		
		return fdao.getAllFlightInfo();
	}
	
	}
