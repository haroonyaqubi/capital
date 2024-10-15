package com.humanbooster.capital.Model;

import jakarta.persistence.*;

@Entity
public class Capitale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nom;

    @Basic
    private String picture;

    @Basic
    private String latitude;

    @Basic
    private String longitude;

    private int NomberHabitation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getNomberHabitation() {
        return NomberHabitation;
    }

    public void setNomberHabitation(int nomberHabitation) {
        NomberHabitation = nomberHabitation;
    }

    public Capitale(Long id) {
        this.id = id;
    }
}
