package br.executordeclasses;

public class Visitante1 extends Zoologico {
    public String formacao() {
        return "Graduação";
    }
    
    public String areaDePesquisa(){
        return "Genética";
    }

    public String animalDeInteresse() {
        return "Macaco Prego";
    }

    public double computaGenes(double num1, double num2) {
        return (num1+num2);
    }    
    
    public String despedeSe() {
        return "Até mais!";
    }
}

