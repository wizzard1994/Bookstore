package com.example.matik.bookstore;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
class Category {

    @PrimaryKey
    private int _id;

    @ColumnInfo
    @NonNull
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public int get_id() {
        return _id;
    }
}
