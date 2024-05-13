package com.travel.planner.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "destination", schema = "travel_planner_e")
public class Destination {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "placeName")
	private String placeName;

	@Column(name = "packagesName")
	private String packagesName;

	@Column(name = "describition")
	private String describition;

	@Column(name = "imageUrl")
	private String imageUrl;

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

	public String getDescribition() {
		return describition;
	}

	public void setDescribition(String describition) {
		this.describition = describition;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
