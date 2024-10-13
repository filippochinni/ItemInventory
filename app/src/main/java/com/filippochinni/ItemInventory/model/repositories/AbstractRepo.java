package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.AppDatabase;
import com.filippochinni.ItemInventory.model.database.DAOs.BaseDAO;
import com.filippochinni.ItemInventory.model.domain.entities.AbstractEntity;
import com.filippochinni.ItemInventory.model.domain.entities.Compartment;
import com.filippochinni.ItemInventory.model.domain.entities.Container;
import com.filippochinni.ItemInventory.model.domain.entities.Item;
import com.filippochinni.ItemInventory.model.domain.entities.Site;
import com.filippochinni.ItemInventory.model.domain.entities.Location;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractRepo<T extends AbstractEntity> {
	protected BaseDAO<T> baseDAO;
	private final ExecutorService executorService;

	public AbstractRepo(Context context) {
		AppDatabase db = AppDatabase.getDBInstance(context);
		this.baseDAO = this.getDAOFromEntityClass(db);
		this.executorService = Executors.newSingleThreadExecutor();
	}

	public void insertEntity(T entity) {
		executorService.execute(() -> baseDAO.insert(entity));
	}

	public void updateEntity(T entity) {
		executorService.execute(() -> baseDAO.update(entity));
	}

	public void deleteEntity(T entity) {
		executorService.execute(() -> baseDAO.delete(entity));
	}


	private final BaseDAO getDAOFromEntityClass(AppDatabase db) {
		Class<T> entityClass = this.getEntityClass();

		if (entityClass == Site.class) {
			return db.siteDAO();
		} else if (entityClass == Location.class) {
			return db.locationDAO();
		} else if (entityClass == Compartment.class) {
			return db.compartmentDAO();
		} else if (entityClass == Container.class) {
			return db.containerDAO();
		} else if (entityClass == Item.class) {
			return db.itemDAO();
		}
		throw new IllegalArgumentException("Unknown entity class: " + entityClass);
	}

	private final Class<T> getEntityClass() {
		Type superclass = getClass().getGenericSuperclass();
		Type type = ((ParameterizedType) superclass).getActualTypeArguments()[0];
		Class<T> entityClass = (Class<T>) type;
		return entityClass;
	}

}
