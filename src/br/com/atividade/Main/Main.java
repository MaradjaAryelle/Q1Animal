package br.com.atividade.Main;
import br.com.atividade.Model.*;

public class Main {
    public static void main(String[]args){
        Cachorro cachorro1 = new Cachorro("Sushi", 3, "cachorro", "SRD", "fêmea");
        //não pode instanciar(atribuir valores) de classes abstratas
        cachorro1.emitirSom();
    }
}
