package com.filippochinni.ItemInventory.model.database.DAOs;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.filippochinni.ItemInventory.model.domain.entities.AbstractEntity;

public interface BaseDAO<T extends AbstractEntity> {
	@Insert
	void insert(T entity);

	@Update
	void update(T entity);

	@Delete
	void delete(T entity);

}
