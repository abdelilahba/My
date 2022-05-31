package com.example.myapplication;

import java.io.Serializable;

public class Produit_table implements Serializable {

    int id;
    String libelle;
    String famille;
    double prixachat;
    double prixvente;

    public Produit_table(){}
    public Produit_table(int id, String libelle, String famille, double prixachat, double prixvente) {
        this.id = id;
        this.libelle = libelle;
        this.famille = famille;
        this.prixachat = prixachat;
        this.prixvente = prixvente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public void setPrixachat(double prixachat) {
        this.prixachat = prixachat;
    }

    public void setPrixvente(double prixvente) {
        this.prixvente = prixvente;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getFamille() {
        return famille;
    }

    public double getPrixachat() {
        return prixachat;
    }

    public double getPrixvente() {
        return prixvente;
    }
}
