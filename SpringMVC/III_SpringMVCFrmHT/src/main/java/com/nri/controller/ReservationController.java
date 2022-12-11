package com.nri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nri.dao.ReservationDao;
import com.nri.dao.ReservationDaoImpl;
import com.nri.model.Reservation;

@Controller
//@RequestMapping(value="ticketreserv")
public class ReservationController {

	@Autowired
	ReservationDao reservationDaoImpl;

	
	/*
	 * public ApplicationContext getIoc() { ApplicationContext ioc = new
	 * ClassPathXmlApplicationContext("nrispring-servlet.xml"); return ioc; }
	 */
	 

	@RequestMapping(value = "/bookingForm")
	public String bookingForm(Model model) {

		Reservation rserv = new Reservation();
		model.addAttribute(rserv);

		return "reservation";
	}

	// Insert a record
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation reservation) {

		reservationDaoImpl.rcrInsert(reservation);

		return "confirmation";
	}

	public ReservationDao getReservationDaoImpl() {
		return reservationDaoImpl;
	}

	public void setReservationDaoImpl(ReservationDao reservationDaoImpl) {
		this.reservationDaoImpl = reservationDaoImpl;
	}
}
