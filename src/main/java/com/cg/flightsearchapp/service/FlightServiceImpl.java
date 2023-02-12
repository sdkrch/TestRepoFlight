package com.cg.flightsearchapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightsearchapp.domain.FlightDto;
import com.cg.flightsearchapp.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepository;

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
	public List<FlightDto> geFlightInfoOriginDest(String origin, String destination) {
		List<FlightDto> flightDetails = flightRepository.geFlightInfoOriginDest(origin,destination);

		return flightDetails;
	}

}
