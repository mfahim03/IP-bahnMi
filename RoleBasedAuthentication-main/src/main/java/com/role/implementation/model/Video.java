package com.role.implementation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int year;
    private String title;
    private String description;

    @Column(name = "youtubeLink") 
    private String youtubeLink;

    @Column(name = "fileName") 
    private String fileName;

    public Video() {
    }

    public Video(int year, String title, String description, String youtubeLink, String fileName) {
        this.year = year;
        this.title = title;
        this.description = description;
        this.youtubeLink = youtubeLink;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}