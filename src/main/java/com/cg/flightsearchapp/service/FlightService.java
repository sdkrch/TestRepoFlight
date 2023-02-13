package com.cg.flightsearchapp.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.flightsearchapp.domain.FlightDto;

public interface FlightService {
	
	public FlightDto postFlightInfo(FlightDto flightDto);
	
	public FlightDto getFlightInfo(Long flightNO);
	
	public List<FlightDto> getAllFlightInfo();
	
	public List<FlightDto> flightByOrigin(String origin);

	public List<FlightDto> flightByOriginAndDest(String origin, String destination);

	public List<FlightDto> flightByPrice(BigDecimal minprice,BigDecimal maxPrice);

}
