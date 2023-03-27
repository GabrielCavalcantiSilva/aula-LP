/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.metodos;

import java.util.Scanner;

/**
 *
 * @author gabrielcsilva
 */
public class Teste {

    public static void main(String[] args) {
        String nome01 = "Giuliana";
        String nome02 = "Garibreu";
        /*
        Para ter acesso aos métodos, precisamos criar um objeto classe
        onde esse método foi criado
        Instanciar para transformar em objeto
         */
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);      
        //String nomeDigitado = leitor.nextLine();
        Calculadora calc = new Calculadora();  
        
        //Chamar método = invocar
        util.exibirNomeFormatado(nome02);
        
        Double soma = calc.somar(10.0, 32.0);
        System.out.println("O valor da soma é: " + soma);
    
        Double divisao = calc.divisao(90.0, 10.0);
        System.out.println("O valor da dda multiplicação é: \"+ multiplicacao);\n" +
"    ivisão é: "+ divisao);
        
        Double subtracao = calc.subtracao(90.0, 10.0);
        System.out.println("O valor da subtração é: "+ subtracao);
        
        Double multiplicacao = calc.multiplicacao(2.0, 8.0);
        System.out.println("O valor da multiplicação é: "+ multiplicacao);
    
    }

}
