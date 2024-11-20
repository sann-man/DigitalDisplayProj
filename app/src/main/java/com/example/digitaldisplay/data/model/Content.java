package com.example.digitaldisplay.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import java.util.Date;

@Entity(tableName = "content")
public class Content {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "content_id")
    private String contentId;

    @ColumnInfo(name = "display_id")
    private String displayId;

    @ColumnInfo(name = "file_url")
    private String fileUrl;

    @ColumnInfo(name = "content_type")
    private String contentType;

    @ColumnInfo(name = "duration")
    private long duration;

    @ColumnInfo(name = "upload_time")
    private Date uploadTime;

    @ColumnInfo(name = "status")
    private String status;

    // Constructor
    public Content(@NonNull String contentId) {
        this.contentId = contentId;
    }

    // Getters and Setters
    @NonNull
    public String getContentId() {
        return contentId;
    }

    public void setContentId(@NonNull String contentId) {
        this.contentId = contentId;
    }

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
