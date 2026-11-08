package com.elastech.petshop.Model;

public class Pet {
    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEspecie(){
        return this.especie;
    }

    public int getIdade(){
        return this.idade;
    }




}
