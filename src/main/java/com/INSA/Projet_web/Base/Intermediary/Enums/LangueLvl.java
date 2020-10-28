package com.INSA.Projet_web.Base.Intermediary.Enums;

public enum LangueLvl {
    A1("A1"),A2("A1"),B1("B1"),B2("B2"),C1("C1"),C2("C2");
    String niveau;

    LangueLvl(String niveau) {
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }
}
