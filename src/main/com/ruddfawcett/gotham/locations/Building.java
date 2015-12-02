package com.ruddfawcett.gotham.locations;

import java.util.List;

import com.ruddfawcett.gotham.locations.Location;
import com.ruddfawcett.gotham.locations.Floor;

public class Building extends Location {
	private List<Floor> floors;
	
	public Building(String name, String description, List<Floor> floors) {
		super(name, description);
		this.floors = floors;
	}
}
