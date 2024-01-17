package com.example;

public class Studente {
    public String nome;
    public String cognome;

    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public Studente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome;
    }
}
