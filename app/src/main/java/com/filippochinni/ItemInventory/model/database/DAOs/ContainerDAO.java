package com.filippochinni.ItemInventory.model.database.DAOs;

import com.filippochinni.ItemInventory.model.domain.entities.Container;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContainerDAO extends BaseDAO<Container> {

	@Query("SELECT * FROM Container")
	public List<Container> getAllContainers();

}
