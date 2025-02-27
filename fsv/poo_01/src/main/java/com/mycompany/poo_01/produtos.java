/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_01;

/**
 *
 * @author 15698302
 * tipo nao primitivo (começa com letra maiuscula) - classes - exemplo (String) 
 * tipos primitivos (começa com letra minuscula) - representa coisas 
 * fundamentais - boolean, float, int
 */
public class produtos {
    String nome;
    float preco;
    private int quantidade; /*não posso acessar diretamento a variavel*/
    final int MAX_ESTOQUE = 2200; /* uma constante - nao pode alterar seu valor*/
    final int MIN_ESTOQUE = 100;
    public produtos(){ /*construtor padrão: se voce declarar ou nao ele vai estar aqui,
        nao tem retorno*/
    System.out.println("Produto criado");
    }
    public produtos( String umNome, float umPreco, int umaQnt){
        nome= umNome;
        preco = umPreco;
        quantidade = umaQnt;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void Print(){
        System.out.println("Nome: " + nome + ", Preço: " + preco + " Quantidade: " + quantidade);
    }
    public void Adicioar(int umaQnt){
        /** criar uma flag para quando o adicionar estiver vazio chama esse metodo*/
        if(quantidade+umaQnt > MAX_ESTOQUE){
            System.out.println("Não foi possível adicionar, quantidade máxima do estoque atingida");
        }
        else{
        quantidade += umaQnt;
    } 
}
    public void Remover(int umaQnt){
        if(quantidade - umaQnt < MIN_ESTOQUE){
            System.out.println("Não foi possível remover, quantidade mínima do estoque atingida");
    }else{
        quantidade -= umaQnt;
        }}
    
    public String toString(){
        /**modifica o toString 
         * por padrão ele retorna o endereço de memoria do seu objeto 
         * mas como fizemos esse metodo então ele retornará o que passamos no return */
      return "Nome: " + nome + ", Preço: " + preco + " Quantidade: " + quantidade;
    }
}
