package com.cg.flightsearchapp.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightsearchapp.domain.FlightDto;
import com.cg.flightsearchapp.service.FlightService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/Flight")
public class FlightSearchController {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping
	public ResponseEntity<?> postFlightInfo(@RequestBody FlightDto flightDto) {

		FlightDto flightDetails = flightService.postFlightInfo(flightDto);
		return new ResponseEntity<>(flightDetails, HttpStatus.CREATED);
	}

	@GetMapping("/{FlightNO}")
	public ResponseEntity<?> getFlightInfo(@PathVariable(required = true) Long FlightNO) {
		FlightDto flightDetails = flightService.getFlightInfo(FlightNO);
		return new ResponseEntity<>(flightDetails, HttpStatus.OK);
	}
	
	@GetMapping("/AllFlightInfo")
	public ResponseEntity<?> getAllFlightInfo() {
		List<FlightDto> flightDetails = flightService.getAllFlightInfo();
		return new ResponseEntity<>(flightDetails, HttpStatus.OK);
	}
	
	@GetMapping("/FlightInfoOriginDest/{origin}/{destination}")
	public ResponseEntity<?> geFlightInfoOriginDest(@RequestParam(required = true) String origin,
			@RequestParam(required = true) String destination){
		List<FlightDto> flightDetailsbet = flightService.geFlightInfoOriginDest(origin,destination);
		return new ResponseEntity<>(flightDetailsbet, HttpStatus.OK);
	}
}
