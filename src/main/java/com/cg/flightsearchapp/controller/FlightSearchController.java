package com.cg.flightsearchapp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.*;

import com.cg.flightsearchapp.domain.FlightDto;
import com.cg.flightsearchapp.service.FlightService;

@RestController
@RequestMapping("/Flight")
public class FlightSearchController {

	private static final Logger logger = LoggerFactory.getLogger(FlightSearchController.class);

	@Autowired
	FlightService flightService;

	@PostMapping("/addFlightInfo")
	public ResponseEntity<?> addFlightInfo(@RequestBody FlightDto flightDto) {
		logger.info("addFlightInfo");

		FlightDto flightDetails = flightService.postFlightInfo(flightDto);
		return new ResponseEntity<>(flightDetails, HttpStatus.CREATED);
	}

	@GetMapping("/{FlightNO}")
	public ResponseEntity<?> getflightByFlightNO(@PathVariable(required = true) Long FlightNO) {
		logger.info("inside getflightByFlightNO");

		FlightDto flightDetails = flightService.getFlightInfo(FlightNO);
		return new ResponseEntity<>(flightDetails, HttpStatus.OK);
	}

	@GetMapping("/AllFlightInfo")
	public ResponseEntity<?> getallflightInfo() {
		logger.info("inside getallflightInfo");

		List<FlightDto> flightDetails = flightService.getAllFlightInfo();
		return new ResponseEntity<>(flightDetails, HttpStatus.OK);
	}

	
	@RequestMapping("/flightByOrigin")
	public ResponseEntity<?> flightByOrigin(@RequestParam String origin) {
		logger.info("inside flightByOrigin");

		logger.info("inside flightByOrigin"+origin);
		List<FlightDto> flightDetailsbet = flightService.flightByOrigin(origin);
		return new ResponseEntity<>(flightDetailsbet, HttpStatus.OK);
	}
	

	@GetMapping("/flightByOriginAndDest")
	public ResponseEntity<?> flightByOriginAndDest(@RequestParam(value = "origin") String origin,

			@RequestParam(value = "destination") String destination) {
		
		logger.info("inside flightByOriginAndDest");
		List<FlightDto> flightDetailsbet = flightService.flightByOriginAndDest(origin,destination);
		return new ResponseEntity<>(flightDetailsbet, HttpStatus.OK);
	}
	

	
	@GetMapping("/flightByPrice")
	public ResponseEntity<?> flightByPrice(@RequestParam(value = "minPrice") BigDecimal minPrice,

			@RequestParam(value = "maxPrice") BigDecimal maxPrice) {
		
		logger.info("inside flightByPrice");
		List<FlightDto> flightDetailsbet = flightService.flightByPrice(minPrice,maxPrice);
		return new ResponseEntity<>(flightDetailsbet, HttpStatus.OK);
	}

}
