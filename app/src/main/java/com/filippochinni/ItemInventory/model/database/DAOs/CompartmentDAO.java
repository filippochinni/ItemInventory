package com.filippochinni.ItemInventory.model.database.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import com.filippochinni.ItemInventory.model.domain.entities.Compartment;

import java.util.List;

@Dao
public interface CompartmentDAO extends BaseDAO<Compartment> {

	@Query("SELECT * FROM Compartment")
	public List<Compartment> getAllCompartments();

}
