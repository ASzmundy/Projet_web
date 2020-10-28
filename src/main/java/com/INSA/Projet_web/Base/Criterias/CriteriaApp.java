package com.INSA.Projet_web.Base.Criterias;

import com.INSA.Projet_web.Base.Intermediary.Enums.Domains;
import com.INSA.Projet_web.Base.Intermediary.Location;
import com.INSA.Projet_web.Base.Users.Apprentice;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.List;

//Cette classe modélise des critères de recherche de contrat d'un apprenti
@Entity
public class CriteriaApp implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long crappid; //ID du critère de l'apprenti dans la base de données
    @OneToOne(orphanRemoval = true)
    private Apprentice apprentice; //L'apprenti qui emet ces critères
    @OneToMany(orphanRemoval = true)
    private List<Location> locations; //Emplacement souhaité du futur contrat
    @ElementCollection
    private List<Domains> domains; //Domaines dans lesquels il étudie/a étudié
    private int duration_min; //durée minimale souhaité du contrat
    private int duration_max; // durée maximale souhaité du contrat

    //constructeur
    public CriteriaApp(){}
    public CriteriaApp(Apprentice apprenti, List<Location> locations, List<Domains> domaines, int duree_min, int duree_max) {
        this.apprentice = apprenti;
        this.locations = locations;
        this.domains = domaines;
        this.duration_min = duree_min;
        this.duration_max = duree_max;
    }

    //getters/setters
    public Apprentice getApprentice() {
        return apprentice;
    }

    public void setApprentice(Apprentice apprentice) {
        this.apprentice = apprentice;
    }

    public List<Domains> getDomains() {
        return domains;
    }

    public void setDomains(List<Domains> domains) {
        this.domains = domains;
    }

    public int getDuration_min() {
        return duration_min;
    }

    public void setDuration_min(int duration_min) {
        this.duration_min = duration_min;
    }

    public int getDuration_max() {
        return duration_max;
    }

    public void setId(Long ID_CrApp) {
        this.crappid = ID_CrApp;
    }

    public void setDuration_max(int duration_max) {
        this.duration_max = duration_max;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Domains> getDomaines() {
        return domains;
    }

    public void setDomaines(List<Domains> domaines) {
        this.domains = domaines;
    }

    public int getDuree_min() {
        return duration_min;
    }

    public void setDuree_min(int duree_min) {
        this.duration_min = duree_min;
    }

    public int getDuree_max() {
        return duration_max;
    }

    public void setDuree_max(int duree_max) {
        this.duration_max = duree_max;
    }

    public Long getId() {
        return crappid;
    }
}