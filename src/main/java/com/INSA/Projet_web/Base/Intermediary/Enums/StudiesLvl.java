package com.INSA.Projet_web.Base.Intermediary.Enums;

public enum StudiesLvl {
    CAP("CAP"),BAC("BAC"),BAC2("BAC+2"),BAC3("BAC+3"),BAC4("BAC+4"),BAC5("BAC+5"),BAC6("BAC+6"),BAC7("BAC+7"),BAC8PLUS("BAC+8 ou plus");

    private final String complet ;

    private StudiesLvl(String complet) {
        this.complet = complet ;
    }

    public String getComplet() {
        return  this.complet ;
    }
}
