package br.com.atividade.Model;

public class Leao extends Animal{
    public boolean juba;

    public Leao(String nome, int idade, String especie, boolean juba, String sexo) {
        super(nome, idade, especie, sexo);
        this.juba = juba;
    }
}

