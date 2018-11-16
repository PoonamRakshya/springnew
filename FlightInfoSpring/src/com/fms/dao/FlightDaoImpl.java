package com.fms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.fms.bean.FlightBean;
@Repository
@Transactional
public class FlightDaoImpl implements IFlightDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ArrayList<FlightBean> getAllFlightInfo() {
		Query qry=em.createNamedQuery("getAllFlights");
		
		return (ArrayList<FlightBean>) qry.getResultList();
	}

}
