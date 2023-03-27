/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.primeiro.projeto.nivelamento;

/**
 *
 * @author Cocod
 */
public class Operador {
    public static void main(String[] args) {
        
       Integer numero01 = 10;
       Double numero02 = 2.0;

       //Iguais ao do JS
       //Soma: +
       //Subtração: -
       //Divisão: /
       //Multiplicação: *
       //Resto: %
       // +=
       // -=
       // ++
       // --
       
       
       
       //Diferente do JS
       // Não tem **
       // Potência: Math.pow(x,y);
       
        // Soma
        Double soma = numero01 + numero02;

        System.out.println("Soma com variável: " + soma);
        System.out.println("Soma no print: " + (numero01 + numero02));
        
        // Subtração
        System.out.println("Subtração: " +(numero01 - numero02));
        
        // Multiplicaçao
        System.out.println("Multiplicação: "+(numero01 * numero02));
        
        //Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
        
        // Resto
        System.out.println("Resto: " + (numero01 % numero02));
        
        //Potência:
        Double potencia = Math.pow(2.0, 5.0);
        System.out.println("Potência: " + potencia);
        
        
        //Uma classe também pode ter variáveis que nos ajudam
        System.out.println("Valor de PI: " + Math.PI);
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
