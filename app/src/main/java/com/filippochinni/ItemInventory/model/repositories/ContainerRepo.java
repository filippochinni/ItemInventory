package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.DAOs.ContainerDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Container;

import java.util.List;

public class ContainerRepo extends AbstractRepo<Container> {
	private final ContainerDAO containerDAO;

	public ContainerRepo(Context context) {
		super(context);
		this.containerDAO = (ContainerDAO) this.baseDAO;
	}

	public List<Container> getAllContainers() {
		return containerDAO.getAllContainers();
	}

}
