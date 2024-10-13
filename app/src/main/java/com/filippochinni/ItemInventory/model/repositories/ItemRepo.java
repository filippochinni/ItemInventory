package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.DAOs.ItemDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Item;

import java.util.List;

public class ItemRepo extends AbstractRepo<Item> {
	private final ItemDAO itemDAO;

	public ItemRepo(Context context) {
		super(context);
		this.itemDAO = (ItemDAO) this.baseDAO;
	}

	public List<Item> getAllItems() {
		return itemDAO.getAllItems();
	}

}
