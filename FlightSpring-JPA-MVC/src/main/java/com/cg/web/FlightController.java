package com.cg.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.entity.Flight;
import com.cg.exception.InvalidFlightException;
import com.cg.service.FlightService;
import com.cg.service.FlightServiceImpl;

@Controller
public class FlightController {

	@Autowired
	private FlightService service;
	
	
	@RequestMapping("/add.do")
	public String addFlight(Flight flight, Map model) {
		System.out.println("$$$$$$$"+flight.getCarrier());
		System.out.println("$$$$$$$"+flight.getFlid());
		service.addFlight(flight);
		model.put("flight", flight);
		
		return "list";
	}
	
	@RequestMapping("/find.do")
	public String findFlight(int id, Map model) throws InvalidFlightException {
		Flight flight = service.getFlight(id);
		model.put("flight", flight);
		return "find";
	}
	@RequestMapping("/list.do")
	public String fetchAll(Map model) {
		List<Flight> flights = service.getList();
		model.put("list", flights);System.out.println("#####"+model.size());
		return "list";
	}
	
}
