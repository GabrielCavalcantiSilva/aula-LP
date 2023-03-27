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
public class Login {

    public static void main(String[] args) {
        String login = "admin";
        String senha = "#SPtech2022";
        Scanner leitor = new Scanner(System.in);
        String loginEntrada;
        String senhaEntrada;
        do {
            System.out.println("Digite o seu login: ");
            loginEntrada = leitor.nextLine();
            System.out.println("Digite a sua senha: ");
            senhaEntrada = leitor.nextLine();
            

        }while(!login.equals(loginEntrada) || !senha.equals(senhaEntrada));
    
                System.out.println("Login realizado com sucesso");

    
    }
}
