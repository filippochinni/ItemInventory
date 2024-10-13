package com.filippochinni.ItemInventory.model.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.filippochinni.ItemInventory.model.database.DAOs.BaseDAO;
import com.filippochinni.ItemInventory.model.database.DAOs.CompartmentDAO;
import com.filippochinni.ItemInventory.model.database.DAOs.ContainerDAO;
import com.filippochinni.ItemInventory.model.database.DAOs.ItemDAO;
import com.filippochinni.ItemInventory.model.database.DAOs.LocationDAO;
import com.filippochinni.ItemInventory.model.database.DAOs.SiteDAO;
import com.filippochinni.ItemInventory.model.domain.entities.Compartment;
import com.filippochinni.ItemInventory.model.domain.entities.Container;
import com.filippochinni.ItemInventory.model.domain.entities.Item;
import com.filippochinni.ItemInventory.model.domain.entities.Location;
import com.filippochinni.ItemInventory.model.domain.entities.Site;

@Database(entities = {Site.class, Location.class, Compartment.class, Container.class, Item.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

	public abstract SiteDAO siteDAO();
	public abstract LocationDAO locationDAO();
	public abstract CompartmentDAO compartmentDAO();
	public abstract ContainerDAO containerDAO();
	public abstract ItemDAO itemDAO();

	private static final String DB_NAME = "ItemInventoryDB";
	private static volatile AppDatabase appDatabase;

	public static synchronized AppDatabase getDBInstance(Context context){
		if (appDatabase == null) {
			appDatabase = createDB(context);
		}
		return appDatabase;
	}

	private static AppDatabase createDB(Context context) {
		//context.deleteDatabase(DB_NAME);	//TODO togliere quando si finisce lo sviluppo
		return Room.databaseBuilder(context, AppDatabase.class, DB_NAME)
				.fallbackToDestructiveMigration()	//TODO togliere quando si finisce lo sviluppo
				.build();
	}

}
