package com.cg.flightsearchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightsearchapp.domain.FlightDto;

@Repository
public interface FlightRepository extends JpaRepository<FlightDto, Long>{

	List<FlightDto> geFlightInfoOriginDest(String origin, String destination);

	//public List<FlightDto> geFlightInfoOriginDest(String origin, String destination);

}
