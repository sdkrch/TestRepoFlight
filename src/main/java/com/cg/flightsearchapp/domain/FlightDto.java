package com.cg.flightsearchapp.domain;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
//import javax.validation.constraints.NotBlank;
import java.util.Date;

//@Embeddable
@Entity
@Table(name="Flight_Details")
public class FlightDto implements Serializable {
	
	  
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	  @Id	 
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="FLIGHT_NO")
	  private Long flightNO;
	  
	  @Column(name="ORIGIN")
	  private String origin;
	  
	  @Column(name="DESTINATION")
	  private String destination;
	  
	  @Column(name="DEPARTURE_TIME", columnDefinition = "TIMESTAMP")
	  private LocalDateTime departureTime;
	  
	  @Column(name="ARRIVAL_TIME", columnDefinition = "TIMESTAMP")
	  private LocalDateTime arrivalTime;
	  
	  @Column(name="PRICE")
	  private BigDecimal flightPrice;

	/**
	 * @return the flightNO
	 */
	public Long getFlightNO() {
		return flightNO;
	}

	/**
	 * @param flightNO the flightNO to set
	 */
	public void setFlightNO(Long flightNO) {
		this.flightNO = flightNO;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the departureTime
	 */
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the flightPrice
	 */
	public BigDecimal getFlightPrice() {
		return flightPrice;
	}

	/**
	 * @param flightPrice the flightPrice to set
	 */
	public void setFlightPrice(BigDecimal flightPrice) {
		this.flightPrice = flightPrice;
	}




	
}
