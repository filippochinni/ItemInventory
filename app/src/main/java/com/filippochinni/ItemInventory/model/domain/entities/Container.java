package com.filippochinni.ItemInventory.model.domain.entities;

import static androidx.room.ForeignKey.NO_ACTION;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Container",
		foreignKeys = @ForeignKey(
				entity = Compartment.class,
				parentColumns = "compartment_id",
				childColumns = "compartment_id",
				onDelete = NO_ACTION
		)
)
public class Container extends AbstractEntity {
	private static final String TABLE_NAME = "Container";

	@ColumnInfo(name = "container_id")
	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "name")
	@NonNull
	private String name;

	@ColumnInfo(name = "type")
	@NonNull
	private String type;

	@ColumnInfo(name = "notes")
	@Nullable
	private String notes;

	@ColumnInfo(name = "compartment_id")
	private int compartmentId;


	public Container(String name, String type, String notes, int compartmentId) {
		this.name = name;
		this.type = type;
		this.notes = notes;
		this.compartmentId = compartmentId;
	}

	public int getId() {
		return id;
	}

	@NonNull
	public String getName() {
		return name;
	}

	@NonNull
	public String getType() {
		return type;
	}

	@Nullable
	public String getNotes() {
		return notes;
	}

	public int getCompartmentId() {
		return compartmentId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(@NonNull String name) {
		this.name = name;
	}

	public void setType(@NonNull String type) {
		this.type = type;
	}

	public void setNotes(@Nullable String notes) {
		this.notes = notes;
	}

	public void setCompartmentId(int compartmentId) {
		this.compartmentId = compartmentId;
	}

	@Override
	public String toString() {
		return "Container{" +
				"id=" + id +
				", name='" + name + '\'' +
				", type='" + type + '\'' +
				", notes='" + notes + '\'' +
				", compartmentId=" + compartmentId +
				'}';
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}

