package br.executordeclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class Aluno extends Pessoa {
    @Override
    public String identificaSe() {
        return "Sou um aluno de graduação.";
    }

    @Override
    public String respondePergunta() {
        return "Acho que entendi, professor!";
    }

    public double computa(double num1, double num2) {
        return (num1-num2);
    }    
        
    

    public String despedeSe() {
        return "Valeu, professor! Até a próxima.";
    }
}
