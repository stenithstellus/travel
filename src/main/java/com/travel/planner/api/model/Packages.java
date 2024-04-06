package com.travel.planner.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "packages", schema = "travel_planner_e")
public class Packages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	

	@Column(name = "placeName")
	private String placeName;

	@Column(name = "packagesName")
	private String packagesName;

	@Column(name = "accomodation")
	private long accomodation;
	
	
	@Column(name = "food")
	private long food;
	
	@Column(name = "activites")
	private String activites;
	
	@Column(name = "transportation")
	private long transportation;
	
	@Column(name = "totalPrice")
	private long totalPrice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPackagesName() {
		return packagesName;
	}

	public void setPackagesName(String packagesName) {
		this.packagesName = packagesName;
	}

	public long getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(long accomodation) {
		this.accomodation = accomodation;
	}

	public long getFood() {
		return food;
	}

	public void setFood(long food) {
		this.food = food;
	}

	public String getActivites() {
		return activites;
	}

	public void setActivites(String activites) {
		this.activites = activites;
	}

	public long getTransportation() {
		return transportation;
	}

	public void setTransportation(long transportation) {
		this.transportation = transportation;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	

}
