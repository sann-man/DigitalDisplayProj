package com.example.digitaldisplay.data.local;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.lifecycle.LiveData;
import com.example.digitaldisplay.data.model.Content;
import java.util.List;

@Dao
public interface ContentDao {
    @Query("SELECT * FROM content")
    LiveData<List<Content>> getAll();

    @Query("SELECT * FROM content WHERE display_id = :displayId")
    LiveData<List<Content>> getForDisplay(String displayId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Content> contents);

    @Delete
    void delete(Content content);

    @Query("DELETE FROM content")
    void deleteAll();
}