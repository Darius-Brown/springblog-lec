package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Ads need titles
    @Column(nullable = false, length = 100 )
    private String title;

    //ads need description
    @Column(nullable = false, length = 255)
    private String description;

    public Ad() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


}
