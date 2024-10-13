package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.DAOs.CompartmentDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Compartment;

import java.util.List;

public class CompartmentRepo extends AbstractRepo<Compartment> {
	private final CompartmentDAO compartmentDAO;

	public CompartmentRepo(Context context) {
		super(context);
		this.compartmentDAO = (CompartmentDAO) this.baseDAO;
	}

	public List<Compartment> getAllCompartments() {
		return compartmentDAO.getAllCompartments();
	}

}
