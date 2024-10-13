package com.filippochinni.ItemInventory.model.database.DAOs;


import androidx.room.Dao;
import androidx.room.Query;

import com.filippochinni.ItemInventory.model.domain.entities.Item;

import java.util.List;

@Dao
public interface ItemDAO extends BaseDAO<Item> {

	@Query("SELECT * FROM Item")
	public List<Item> getAllItems();

}
