package com.cg.flightsearchapp.service;

import java.util.List;

import com.cg.flightsearchapp.domain.FlightDto;

public interface FlightService {
	
	public FlightDto postFlightInfo(FlightDto flightDto);
	
	public FlightDto getFlightInfo(Long flightNO);
	
	public List<FlightDto> getAllFlightInfo();
	
	public List<FlightDto> geFlightInfoOriginDest(String origin,String destination);

}
