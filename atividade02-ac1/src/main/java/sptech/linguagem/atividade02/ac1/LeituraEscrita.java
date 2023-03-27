/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.primeiro.projeto.nivelamento;

import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        //Para ler valores do teclado
        //Usamos a classe Scanner
        
        //Leitor não é uma simples variável
        //Mas sim um objeto!
        //Criar um objeto = instânciar
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("Seu nome: ");
        String nomeDigitado = Leitor.nextLine();
                
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = Leitor.nextInt();
        
        System.out.println("Digite a sua altura: ");
        Double alturaDigitada = Leitor.nextDouble();
        
        System.out.println("Nome: " + nomeDigitado + 
                "\nIdade: " + idadeDigitada + 
                "\nAltura: " + alturaDigitada);
        
        
    }
}
