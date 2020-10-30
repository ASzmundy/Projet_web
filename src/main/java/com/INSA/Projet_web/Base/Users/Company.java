package com.INSA.Projet_web.Base.Users;

import com.INSA.Projet_web.Base.Intermediary.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

//Cette classe modélise une entreprise
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idcompany; //ID de l'entreprise dans la base de données
    private String name; //Nom de l'entreprise
    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
    private List<Location> locations; //Emplacements où l'entreprise est présente
    private String siret; //SIRET de l'entreprise
    private String siren; //SIREN de l'entreprise
    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Recruiter> recruiters; //Recruteurs de l'entreprise

    //constructeur
    public Company(){}
    public Company(String name, List<Location> locations, String siret, String siren, List<Recruiter> recruiters) {
        this.name = name;
        this.locations = locations;
        this.siret = siret;
        this.siren = siren;
        this.recruiters = recruiters;
    }

    //getters-setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Recruiter> getRecruiters() {
        return recruiters;
    }

    public String getSiret() {
        return siret;
    }

    public String getSiren() {
        return siren;
    }

    public void setRecruiters(List<Recruiter> recruiters) {
        this.recruiters = recruiters;
    }

    public Long getIdcompany() {
        return idcompany;
    }

    public void setIdcompany(Long id_company) {
        this.idcompany = id_company;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }
}
