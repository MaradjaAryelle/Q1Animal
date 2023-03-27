package br.com.atividade.Model;

public class Gato extends Animal {
    public String raca;

    public Gato(String nome, int idade, String especie, String raca, String sexo) {
        super(nome, idade, especie, sexo);
        this.raca = raca;
    }
}