/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.lista.exercicio02;

import java.util.Scanner;

/**
 *
 * @author Cocod
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numSoma = 0;
        Integer numDigitado;
        Integer valorSoma = 0;

        do {
            System.out.println("Digite um número para a soma quando quiser parar digite 0: ");
            numDigitado = leitor.nextInt();
            numSoma = numSoma + numDigitado;
            valorSoma = numSoma + numDigitado;
        } while (numDigitado != 0);

        System.out.println("O valor da soma é: " + valorSoma);
    }
}
