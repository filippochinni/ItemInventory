package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.DAOs.LocationDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Location;

import java.util.List;

public class LocationRepo extends AbstractRepo<Location> {
	private final LocationDAO locationDAO;

	public LocationRepo(Context context) {
		super(context);
		this.locationDAO = (LocationDAO) this.baseDAO;
	}

	public List<Location> getAllLocations() {
		return locationDAO.getAllLocations();
	}

}
