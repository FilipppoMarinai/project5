package com.example;

import java.util.ArrayList;

public class Aula {
    public String classe;
    public String sezione;
    public String indirizzo;
    public ArrayList<Studente> studenti;

    public Aula(String classe, String sezione, String indirizzo, ArrayList<Studente> studenti){
        this.classe = classe;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
        this.studenti = studenti;
    }

    public Aula(){}

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        int count = 1;
        String aula = "Classe: " + classe + 
        ", Sezione: " + sezione + 
        ", Indirizzo: " + indirizzo + "\n";
        for (Studente studente : studenti) {
            aula += " Studente " + count + ": " + studente.toString() + "\n";
            count++;
        }

        return aula;
    }
}
