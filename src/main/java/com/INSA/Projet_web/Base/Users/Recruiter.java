package com.INSA.Projet_web.Base.Users;

import com.INSA.Projet_web.Base.Criterias.CriteriaRec;
import com.INSA.Projet_web.Base.Intermediary.Location;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

//Cette classe modélise un recruteur
@Entity
public class Recruiter extends User{
    @ManyToOne(cascade=CascadeType.ALL)
    private Company company; //l'entreprise du recruteur
    @OneToOne(cascade=CascadeType.ALL, orphanRemoval = true)
    CriteriaRec criteria_rec; //Critères du recruteur

    //constructeurs
    public Recruiter(){
        super();
    }
    public Recruiter(String name, String firstname, LocalDate birthday, String mail, String phonenum, Location location, Company company, CriteriaRec criteria_rec) {
        super(name,firstname, birthday, mail, phonenum, location);
        this.company = company;
        //this.criteria_rec = criteria_rec;
    }

    //getters-setters
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CriteriaRec getCriteria_rec() {
        return criteria_rec;
    }

    public void setCriteria_rec(CriteriaRec criteria_rec) {
        this.criteria_rec = criteria_rec;
    }

}

