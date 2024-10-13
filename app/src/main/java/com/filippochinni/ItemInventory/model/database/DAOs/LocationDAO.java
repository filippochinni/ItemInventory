package com.filippochinni.ItemInventory.model.database.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import com.filippochinni.ItemInventory.model.domain.entities.Location;

import java.util.List;

@Dao
public interface LocationDAO extends BaseDAO<Location> {

	@Query("SELECT * FROM Location")
	public List<Location> getAllLocations();

}
