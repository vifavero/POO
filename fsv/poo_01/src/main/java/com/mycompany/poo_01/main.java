/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_01;

/**
 *
 * @author 15698302
 * por estar no mesmo package nao preciso importar 
 * sout+tab - preenche
 */
public class main {
    public static void main (String [] args){
        System.out.println("Hello World");
        produtos p = new produtos (); /*consrutor padrão*/
        System.out.println(p);
        System.out.println(p.nome);
        System.out.println(p.preco);
        System.out.println(p.getQuantidade());
        
        produtos p2 = new produtos("jv", 3000.0f,2000);
        System.out.println(p2);
        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.getQuantidade());
        
        p.Print();
        p2.Print();
        
        p2.Adicioar(10);
        p2.Print();
        
        p.Adicioar(100);
        p.Print();
        
        p.Remover(50);
        p.Print();
        
        p2.Adicioar(320);
        
        
    }
}
