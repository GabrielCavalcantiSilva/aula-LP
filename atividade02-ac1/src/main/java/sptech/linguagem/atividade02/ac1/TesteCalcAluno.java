/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.atividade02.ac1;

import java.util.Scanner;

/**
 *
 * @author gabrielcsilva
 */
public class TesteCalcAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoAluno media = new CalculoAluno();
        
        System.out.println("Insira a primeira nota: ");
        Double nota01 = leitor.nextDouble();
        System.out.println("Insira a segunda nota: ");
        Double nota02 = leitor.nextDouble();
        
        Double valorMedia = media.CalcularMedia(nota01, nota02);
        
        System.out.println(valorMedia);
    }
}
