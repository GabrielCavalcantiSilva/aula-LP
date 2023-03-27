/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author gabrielcsilva
 */
public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculoAluno calcAln = new CalculoAluno();
        System.out.println("Digite o valor da primeira nota:");
        Double nota1 = scan.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        Double nota2 = scan.nextDouble();
        
       calcAln.media(nota1, nota2);
        
    }
}
