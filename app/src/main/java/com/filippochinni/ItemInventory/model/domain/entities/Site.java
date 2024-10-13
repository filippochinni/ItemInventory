package com.filippochinni.ItemInventory.model.domain.entities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Site")
public class Site extends AbstractEntity {
	private static final String TABLE_NAME = "Site";

	@ColumnInfo(name = "site_id")
	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "name")
	@NonNull
	private String name;

	@ColumnInfo(name = "address")
	@NonNull
	private String address;

	@ColumnInfo(name = "notes")
	@Nullable
	private String notes;


	public Site(String name, String address, String notes) {
		this.name = name;
		this.address = address;
		this.notes = notes;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getNotes() {
		return notes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Site{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", notes='" + notes + '\'' +
				'}';
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}
