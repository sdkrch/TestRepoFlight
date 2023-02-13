package com.cg.flightsearchapp.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightsearchapp.controller.FlightSearchController;
import com.cg.flightsearchapp.domain.FlightDto;
import com.cg.flightsearchapp.repository.FlightRepository;
import com.cg.flightsearchapp.repository.FlightSearchRepository;

@Service
public class FlightServiceImpl implements FlightService {

	private static final Logger logger = LoggerFactory.getLogger(FlightServiceImpl.class);

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private FlightSearchRepository flightSearchRepository;

	@Override
	public FlightDto postFlightInfo(FlightDto flightDto) {
		FlightDto flightinfo = flightRepository.save(flightDto);
		return flightinfo;
	}

	@Override
	public FlightDto getFlightInfo(Long flightNO) {
		FlightDto flightDetails = flightRepository.findById(flightNO).get();
		return flightDetails;
	}

	@Override
	public List<FlightDto> getAllFlightInfo() {
		List<FlightDto> allflightDetails = flightRepository.findAll();
		if (allflightDetails.size() > 0) {
			return allflightDetails;
		} else {
			return new ArrayList<FlightDto>();
		}
	}

	@Override
	public List<FlightDto> flightByOrigin(String origin) {
		List<FlightDto> flightDetailsLT = flightSearchRepository.flightByOrigin(origin);

		return flightDetailsLT;
	}

	@Override
	public List<FlightDto> flightByOriginAndDest(String origin, String destination) {
		// TODO Auto-generated method stub
		List<FlightDto> flightDetailsLT = flightSearchRepository.flightByOriginAndDest(origin, destination);

		return flightDetailsLT;
	}

	@Override
	public List<FlightDto> flightByPrice(BigDecimal minprice,BigDecimal maxPrice) {
		List<FlightDto> flightDetailsLT = flightSearchRepository.flightByPrice(minprice,maxPrice);

		return flightDetailsLT;
	}

}
