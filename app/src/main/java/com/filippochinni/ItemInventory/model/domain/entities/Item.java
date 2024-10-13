package com.filippochinni.ItemInventory.model.domain.entities;

import static androidx.room.ForeignKey.NO_ACTION;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Item",
		foreignKeys = @ForeignKey(
				entity = Container.class,
				parentColumns = "container_id",
				childColumns = "container_id",
				onDelete = NO_ACTION
		)
)
public class Item extends AbstractEntity {
	private static final String TABLE_NAME = "Item";

	@ColumnInfo(name = "item_id")
	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "name")
	@NonNull
	private String name;

	@ColumnInfo(name = "count")
	@Nullable
	private Integer count;

	@ColumnInfo(name = "notes")
	@Nullable
	private String notes;

	@ColumnInfo(name = "path")
	@NonNull
	private String path;

	@ColumnInfo(name = "container_id")
	private int containerId;


	public Item(String name, Integer count, String notes, String path, int containerId) {
		this.name = name;
		this.count = count;
		this.notes = notes;
		this.path = path;
		this.containerId = containerId;
	}

	public int getId() {
		return id;
	}

	@NonNull
	public String getName() {
		return name;
	}

	@Nullable
	public Integer getCount() {
		return count;
	}

	@Nullable
	public String getNotes() {
		return notes;
	}

	@NonNull
	public String getPath() {
		return path;
	}

	public int getContainerId() {
		return containerId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(@NonNull String name) {
		this.name = name;
	}

	public void setCount(@Nullable Integer count) {
		this.count = count;
	}

	public void setNotes(@Nullable String notes) {
		this.notes = notes;
	}

	public void setPath(@NonNull String path) {
		this.path = path;
	}

	public void setContainerId(int containerId) {
		this.containerId = containerId;
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +
				", count=" + count +
				", notes='" + notes + '\'' +
				", path='" + path + '\'' +
				", containerId=" + containerId +
				'}';
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}
