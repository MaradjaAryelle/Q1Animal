package br.com.atividade.Model;

public abstract class Animal {
    public String nome;
    public int idade;
    public String especie;
    public String sexo;

    public Animal (String nome, int idade, String especie, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.sexo = sexo;
    }

    public void emitirSom(){
        System.out.printf("%s emitiu um som!", nome);
    }




}
