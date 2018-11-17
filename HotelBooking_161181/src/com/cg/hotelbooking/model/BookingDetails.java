package com.cg.hotelbooking.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetails")
public class BookingDetails {

	@Id
	private Integer id;
	private String customername;
	private Integer hotelid;
	private Date todate;
	private Date fromdate;
	private Integer noofrooms;

	public BookingDetails() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Integer getHotelid() {
		return hotelid;
	}

	public void setHotelid(Integer hotelid) {
		this.hotelid = hotelid;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Integer getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(Integer noofrooms) {
		this.noofrooms = noofrooms;
	}

	public BookingDetails(Integer id, String customername, Integer hotelid, Date todate, Date fromdate,
			Integer noofrooms) {
		super();
		this.id = id;
		this.customername = customername;
		this.hotelid = hotelid;
		this.todate = todate;
		this.fromdate = fromdate;
		this.noofrooms = noofrooms;
	}

	
}
