package com.filippochinni.ItemInventory.model.repositories;

import android.content.Context;

import com.filippochinni.ItemInventory.model.database.DAOs.SiteDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Site;

import java.util.List;

public class SiteRepo extends AbstractRepo<Site> {
	private final SiteDAO siteDAO;

	public SiteRepo(Context context) {
		super(context);
		this.siteDAO = (SiteDAO) this.baseDAO;
	}

	public List<Site> getAllSites() {
		return siteDAO.getAllSites();
	}

}
