package com.filippochinni.ItemInventory.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.filippochinni.ItemInventory.model.database.AppDatabase;
import com.filippochinni.ItemInventory.model.domain.entities.Site;
import com.filippochinni.ItemInventory.model.repositories.SiteRepo;

public class AddViewModel extends AndroidViewModel {
	private SiteRepo mSiteRepo;

	public AddViewModel(@NonNull Application application) {
		super(application);
		this.mSiteRepo = new SiteRepo(application);
	}

	//TODO review this method
	public void addNewSite(String siteName, String siteAddress, String siteNotes) {
		Site s = new Site(siteName, siteAddress, siteNotes);
		mSiteRepo.insertEntity(s);
	}

}
