package com.cg.flightsearchapp.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.flightsearchapp.domain.FlightDto;

public interface FlightSearchRepository extends JpaRepository<FlightDto, Long>{
	
	@Query(value ="select * FROM Flight_Details  where origin=?",nativeQuery = true)
	public List<FlightDto> flightByOrigin(@Param("origin") String origin);
	
	@Query(value ="select * FROM Flight_Details where origin=? and destination=?",nativeQuery = true)
	public List<FlightDto> flightByOriginAndDest(String origin, String destination);

	@Query(value ="select * FROM Flight_Details where price>= :minPrice and price<= :maxPrice",nativeQuery = true)
	public List<FlightDto> flightByPrice(BigDecimal minPrice, BigDecimal maxPrice);
	 

}
