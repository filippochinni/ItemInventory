package com.filippochinni.ItemInventory.model.domain.entities;

import static androidx.room.ForeignKey.NO_ACTION;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Location",
		foreignKeys = @ForeignKey(
				entity = Site.class,
				parentColumns = "site_id",
				childColumns = "site_id",
				onDelete = NO_ACTION
		)
)
public class Location extends AbstractEntity {
	private static final String TABLE_NAME = "Location";

	@ColumnInfo(name = "location_id")
	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "name")
	@NonNull
	private String name;

	@ColumnInfo(name = "notes")
	@Nullable
	private String notes;

	@ColumnInfo(name = "site_id")
	private int siteId;


	public Location(int id, String name, String notes, int siteId) {
		this.id = id;
		this.name = name;
		this.notes = notes;
		this.siteId = siteId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNotes() {
		return notes;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", name='" + name + '\'' +
				", notes='" + notes + '\'' +
				", siteId=" + siteId +
				'}';
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
}
