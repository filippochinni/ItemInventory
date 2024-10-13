package com.filippochinni.ItemInventory.model.domain.entities;

import static androidx.room.ForeignKey.NO_ACTION;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Compartment",
		foreignKeys = @ForeignKey(
		entity = Location.class,
		parentColumns = "location_id",
		childColumns = "location_id",
		onDelete = NO_ACTION
		)
)
public class Compartment extends AbstractEntity {
	private static final String TABLE_NAME = "Compartment";

	@ColumnInfo(name = "compartment_id")
	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "name")
	@NonNull
	private String name;

	@ColumnInfo(name = "notes")
	@Nullable
	private String notes;

	@ColumnInfo(name = "location_id")
	private int locationId;


	public Compartment(String name, String notes, int locationId) {
		this.name = name;
		this.notes = notes;
		this.locationId = locationId;
	}

	public int getId() {
		return id;
	}

	@NonNull
	public String getName() {
		return name;
	}

	@Nullable
	public String getNotes() {
		return notes;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(@NonNull String name) {
		this.name = name;
	}

	public void setNotes(@Nullable String notes) {
		this.notes = notes;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Compartment{" +
				"id=" + id +
				", name='" + name + '\'' +
				", notes='" + notes + '\'' +
				", locationId=" + locationId +
				'}';
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}
