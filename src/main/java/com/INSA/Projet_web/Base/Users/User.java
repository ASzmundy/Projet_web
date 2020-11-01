package com.INSA.Projet_web.Base.Users;

import com.INSA.Projet_web.Base.Intermediary.Location;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.time.LocalDate;

//Cette classe modélise un utilisateur
@Entity
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id; //ID de la personne dans la base de données
    private String name; //Nom de la personne
    private String firstname; //Prénom de la personne
    private LocalDate birthday; //sa date de naissance
    @Column(unique = true)
    private String mail; //son adresse mail
    private String phonenum; //son numéro de téléphone
    @ManyToOne(cascade= CascadeType.ALL)
    private Location location; //son emplacement (ville, département...)

    //constructeurs
    public User(){};

    public User(String name,String firstname, LocalDate birthday, String mail, String phonenum, Location location) {
        this.name = name;
        this.birthday = birthday;
        this.firstname = firstname;
        this.mail = mail;
        this.phonenum = phonenum;
        this.location = location;
    }

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long ID_user) {
        this.id = ID_user;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //redéfinition de tostring()

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday=" + birthday +
                ", mail='" + mail + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", location=" + location +
                '}';
    }
}
