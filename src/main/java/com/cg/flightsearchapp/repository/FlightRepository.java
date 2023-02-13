package com.cg.flightsearchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.flightsearchapp.domain.FlightDto;

@Repository
public interface FlightRepository extends JpaRepository<FlightDto, Long>{
	
	 
}
