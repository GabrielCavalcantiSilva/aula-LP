/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class BilheteUnico {
    /*
    Atributos = Caracteristica
    */
    
    String nomeTitular;
    Double saldo;
    Boolean possuiMeiaEntrada;
    
    /*
    Métodos = Comportamentos
    */
    
    void carregar(Double valorCarregar){
        if (valorCarregar > 0){
        saldo += valorCarregar;
            System.out.println("Carregado - Saldo: "+ saldo);
        }else {
            System.out.println("Valor informado inválido.");
        }
    }
    
    void usar(){
        if(possuiMeiaEntrada && saldo >= 2.20){
            saldo -= 2.20;
        } else if(saldo >= 4.40){
            saldo -= 4.40;
        }else {
            System.out.println("Passagem bloqueada!");
        }
        System.out.println("Saldo: "+ saldo);
    }
}
