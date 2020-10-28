package com.INSA.Projet_web.Base.Intermediary.Enums;

public enum Domains {
    INFO("Informatique"),MECA("Mécanique"),COM("Commerce"),GI("Génie Industriel"),GEII("Génie Électrique"),BTP("BTP"),OTHER("Autre");

    private final String complet ;

    Domains(String complet) {
        this.complet = complet ;
    }

    public String getComplet() {
        return  this.complet ;
    }
}