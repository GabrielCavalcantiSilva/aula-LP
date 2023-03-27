/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.lista.exercicio02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cocod
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        Integer numDigitado = leitor.nextInt();

        Integer adivinho = ThreadLocalRandom.current().nextInt(0, 11);
            int tentativa = 0;
        while (adivinho != numDigitado) {
            adivinho = ThreadLocalRandom.current().nextInt(0, 11);
            tentativa++;
            System.out.println(String.format("%dª tentativa: %d", tentativa, adivinho));
        }
        System.out.println(String.format("Acertei depois de %d tentativas", tentativa));
        if( tentativa <=3) {
            System.out.println("Você é MUITO sortudo!");
        }else if(tentativa >= 4 && tentativa <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar :/");
        }

    }
}
