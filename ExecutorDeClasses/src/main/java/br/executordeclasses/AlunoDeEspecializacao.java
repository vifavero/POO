/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.executordeclasses;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class AlunoDeEspecializacao extends Pessoa{
    @Override
    public String identificaSe() {
        return "Sou um de MBA.";
    }

    @Override
    public String respondePergunta() {
        return "Gosto de aprender";
    }


    public String despedeSe() {
        return "Até mais.";
    }    
}
