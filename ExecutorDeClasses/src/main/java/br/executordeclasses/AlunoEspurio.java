/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.executordeclasses;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class AlunoEspurio extends Pessoa{



    public String respondePergunta() {
        return "Podemos considerar isso sob uma perspectiva mais ampla?";
    }

    public double computa(double num1, double num2) {
        return Math.pow(num1, num2);
    }    
    
    public String despedeSe() {
        return "Obrigado, professor. Até mais.";
    }    
}
