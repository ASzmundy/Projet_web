package com.INSA.Projet_web.Base.Intermediary;

import com.INSA.Projet_web.Base.Intermediary.Enums.LangueLvl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Cette classe modélise un niveau de langue
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_lvl_lang; // Id dans la BDD
    private String name; //Nom de la langue
    private LangueLvl level; //Niveau de la langue

    //constructeurs
    public Language(){}
    public Language(String name, LangueLvl level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    //getters/setters
    public void setName(String nom) {
        this.name = nom;
    }

    public LangueLvl getLevel() {
        return level;
    }

    public void setLevel(LangueLvl niveau) {
        this.level = niveau;
    }

    public Long getId_lvl_lang() {
        return id_lvl_lang;
    }

    public void setId_lvl_lang(Long ID_lvl_Lang) {
        this.id_lvl_lang = ID_lvl_Lang;
    }

    //redéfinition de tostring()

    @Override
    public String toString() {
        return "Language{" +
                "id_lvl_lang=" + id_lvl_lang +
                ", name='" + name + '\'' +
                ", level=" + level.getNiveau() +
                '}';
    }
}
