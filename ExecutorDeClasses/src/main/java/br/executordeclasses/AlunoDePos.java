package br.executordeclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class AlunoDePos extends Pessoa {
    @Override
    public String identificaSe() {
        return "Sou um aluno de pós-graduação.";
    }

    @Override
    public String respondePergunta() {
        return "Podemos considerar isso sob uma perspectiva mais ampla?";
    }

    public double computa(double num1, double num2) {
        return (num1*num2);
    }    
        


    public String despedeSe() {
        return "Obrigado, professor. Até mais.";
    }
}
