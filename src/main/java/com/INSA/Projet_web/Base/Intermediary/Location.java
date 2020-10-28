package com.INSA.Projet_web.Base.Intermediary;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//Cette classe modélise un emplacement tel qu'une ville
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_loc; //ID de l'emplacement dans la BDD
    private String nom; //Nom de l'emplacement
    private int cp; //Code postal si c'est une ville
    @ManyToOne(cascade=CascadeType.ALL)
    private Location up; //ID de l'Emplacement supérieur ( exemple : Valenciennes a comme up "Nord" et Nord a pour up "Hauts de France" )

    //constructeurs
    public Location(){nom="Thiercelieu";}
    public Location(String nom){
        this.nom=nom;
    }
    public Location(String nom, int cp) {
        this.nom = nom;
        this.cp = cp;
    }

    public Location(String nom, int cp, Location up) {
        this.nom = nom;
        this.cp = cp;
        this.up = up;
    }

    //getters/setteurs

    public String getNom() {
        return nom;
    }

    public int getCp() {
        return cp;
    }

    public Location getUp() {
        return up;
    }

    public void setUp(Location up) {
        this.up = up;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId_loc() {
        return id_loc;
    }

    public void setId_loc(Long id_Loc) {
        this.id_loc = id_Loc;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    //redéfinition de tostring()


    @Override
    public String toString() {
        return "Location{" +
                "id_loc=" + id_loc +
                ", nom='" + nom + '\'' +
                ", cp=" + cp +
                ", up=" + up +
                '}';
    }
}
