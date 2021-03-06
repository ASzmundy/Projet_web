package com.INSA.Projet_web.Base.Criterias;

import com.INSA.Projet_web.Base.Intermediary.Enums.Domains;
import com.INSA.Projet_web.Base.Intermediary.Enums.StudiesLvl;
import com.INSA.Projet_web.Base.Intermediary.Language;
import com.INSA.Projet_web.Base.Users.Recruiter;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


//Cette classe modélise les critères d'un recruteur
@Entity
public class CriteriaRec {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long crrecid; //ID du critère recruteur dans la base de données
    @OneToOne(orphanRemoval = true)
    private Recruiter recruiter; //Le recruteur qui emet ces critères
    @ElementCollection
    private List<Domains> domains; //les domaines souhaités
    @ElementCollection
    private List<StudiesLvl> studiesLvls; //Le niveau de formation souhaité
    private int duration_min; //La durée minimale du contrat qu'il peut proposer (en mois)
    private int duration_max;//La durée maximale du contrat qu'il peut proposer (en mois)
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Language> languages; //Les langues souhaités
    private boolean permisb; //Veut-il un apprenti ayant le permis B ?
    private boolean vehicule; //Veut-il un apprenti possédant un véhicule ?

    //constructeur
    public CriteriaRec(){};
    public CriteriaRec(Recruiter recruiter){
        this.recruiter=recruiter;
    }
    public CriteriaRec(Recruiter recruteur, List<Domains> domaines, List<StudiesLvl> niveauformation, int duree_min, int duree_max, List<Language> languages, boolean permisb, boolean vehicule) {
        this.recruiter = recruteur;
        this.domains = domaines;
        this.studiesLvls = niveauformation;
        this.duration_min = duree_min;
        this.duration_max = duree_max;
        this.languages = languages;
        this.permisb = permisb;
        this.vehicule = vehicule;
    }

    //Getters/setters


    public Long getCrrecid() {
        return crrecid;
    }

    public void setCrrecid(Long ID_CRep) {
        this.crrecid = ID_CRep;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    public List<Domains> getDomains() {
        return domains;
    }

    public void setDomains(List<Domains> domains) {
        this.domains = domains;
    }

    public List<StudiesLvl> getStudiesLvls() {
        return studiesLvls;
    }

    public void setStudiesLvls(List<StudiesLvl> studiesLvls) {
        this.studiesLvls = studiesLvls;
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

    public void setDuration_max(int duration_max) {
        this.duration_max = duration_max;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public boolean isPermisb() {
        return permisb;
    }

    public void setPermisb(boolean permisb) {
        this.permisb = permisb;
    }

    public boolean isVehicule() {
        return vehicule;
    }

    public void setVehicule(boolean vehicule) {
        this.vehicule = vehicule;
    }
}
