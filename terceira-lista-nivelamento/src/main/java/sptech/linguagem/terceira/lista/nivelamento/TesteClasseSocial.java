/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author gabrielcsilva
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClasseSocial calc = new ClasseSocial();
        System.out.println("Digite a sua renda: ");
        Double rendaDigitada = leitor.nextDouble();
        
        Double qtdSalaMin = calc.checarQtdSalaMin(rendaDigitada);
        String classeSocial = calc.checarClasseSocial(qtdSalaMin);
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimos\n"
                + "Você pertence a classe social %s", qtdSalaMin, classeSocial));
    }
}
