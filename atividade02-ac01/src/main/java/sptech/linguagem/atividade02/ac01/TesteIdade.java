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
public class TesteIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Idade resultIdade = new Idade();
        
        System.out.println("Digite a sua idade: ");
        Integer idadeDigitada = scan.nextInt();
        
        resultIdade.classificaIdade(idadeDigitada);
    }
}
