package com.example.villoapp.Model;

public class Adress {
    private String straat;
    private String huisnummer;
    private String stad;
    private String postcode;

    public Adress() {
        // Standaard constructor
    }

    // Constructor met parameters
    public Adress(String straat, String huisnummer, String stad, String postcode) {
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.stad = stad;
        this.postcode = postcode;
    }

    // Getters en setters
    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    // toString() methode om de objectinformatie te tonen
    @Override
    public String toString() {
        return "AdresModel{" +
                "straat='" + straat + '\'' +
                ", huisnummer='" + huisnummer + '\'' +
                ", stad='" + stad + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}

