package com.filippochinni.ItemInventory.model.database.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import com.filippochinni.ItemInventory.model.domain.entities.Site;

import java.util.List;

@Dao
public interface SiteDAO extends BaseDAO<Site> {

	@Query("SELECT * FROM Site")
	public List<Site> getAllSites();

}
