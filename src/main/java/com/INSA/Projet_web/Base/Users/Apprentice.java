package com.INSA.Projet_web.Base.Users;

import com.INSA.Projet_web.Base.Criterias.CriteriaApp;
import com.INSA.Projet_web.Base.Intermediary.Enums.StudiesLvl;
import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Base.Intermediary.Location;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//Cette classe modélise un futur apprenti en recherche de contrat
@Entity
public class Apprentice extends User implements Serializable {
    private StudiesLvl studieslvl;//Niveau actuel d'études de l'apprenti
    @ElementCollection
    private List<String> diplomas; //Diplômes de l'apprenti
    private boolean permisb; //L'apprenti a le permis b ou non
    private boolean vehicle; //L'apprenti est véhiculé ou non
    private String address; //Adresse de l'apprenti
    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
    private List<Language> languages; //Langues parlés par l'apprenti
    @ElementCollection
    private List<String> experience; //Expérience professionnelle de l'apprenti
    private String projet_pro; //Projet professionnel de l'apprenti
    @OneToOne(cascade=CascadeType.PERSIST, orphanRemoval = true)
    private CriteriaApp criteria; //Critères de l'apprenti


    //constructeurs
    public Apprentice(){}
    public Apprentice(String name, String firstname, LocalDate birthday, String mail, String phonenum, Location location, StudiesLvl studieslvl, List<String> diplomas, boolean permisb, boolean vehicle, String address, List<Language> languages, List<String> experience, String projet_pro) {
        super(name,firstname, birthday, mail, phonenum, location);
        this.studieslvl = studieslvl;
        this.diplomas = diplomas;
        this.permisb = permisb;
        this.vehicle = vehicle;
        this.address = address;
        this.languages = languages;
        this.experience = experience;
        this.projet_pro = projet_pro;
        this.criteria=new CriteriaApp(this);
    }
    //getters/setters
    public StudiesLvl getStudieslvl() {
        return studieslvl;
    }

    public void setStudieslvl(StudiesLvl studiesLvl) {
        this.studieslvl = studiesLvl;
    }

    public List<String> getDiplomas() {
        return diplomas;
    }

    public void setDiplomas(List<String> diplomas) {
        this.diplomas = diplomas;
    }

    public boolean isPermisb() {
        return permisb;
    }

    public void setPermisb(boolean permisb) {
        this.permisb = permisb;
    }

    public boolean isVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean vehicule) {
        this.vehicle = vehicule;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public List<String> getExperience() {
        return experience;
    }

    public void setExperience(List<String> experience) {
        this.experience = experience;
    }

    public String getProjet_pro() {
        return projet_pro;
    }

    public void setProjet_pro(String projet_pro) {
        this.projet_pro = projet_pro;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public CriteriaApp getCriteria() {
        return criteria;
    }

    public void setCriteria(CriteriaApp criteria) {
        this.criteria = criteria;
    }
}
