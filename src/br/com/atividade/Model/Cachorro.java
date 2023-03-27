package br.com.atividade.Model;

public class Cachorro extends Animal{
    public String raca;

    public Cachorro(String nome, int idade, String especie, String raca, String sexo) {
        super(nome, idade, especie, sexo);
        this.raca = raca;
    }
}
