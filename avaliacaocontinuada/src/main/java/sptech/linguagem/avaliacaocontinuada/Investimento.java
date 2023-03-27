/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.avaliacaocontinuada;

import java.util.Scanner;

/**
 *
 * @author gabrielcsilva
 */
public class Investimento {
    public static void main(String[] args) {
       Integer escolha = null;
       Double dinheiroEmConta = 0.0;

        do{
            
        
                Scanner scan = new Scanner(System.in);
                System.out.println("""
                           ----------------------------
                           |  Sptech Investimentos    |
                           ----------------------------
                           | Olá, o que deseja fazer: |
                           ----------------------------
                           | 1 - Depositar            |
                           | 2 - Sacar                |
                           | 3 - Simular rendimentos  |
                           | 0 - Sair                 |
                           ----------------------------
                           """);
        escolha = scan.nextInt();
        
        switch (escolha){
            case 1:
                System.out.println("Digite um valor a ser depositado: ");
                Double valorDeposito = scan.nextDouble();
                if (valorDeposito > 0){
                    dinheiroEmConta = dinheiroEmConta + valorDeposito;
                    System.out.println("Deposito realizado com sucesso!\n"
                            + "Saldo atual: "+ dinheiroEmConta);
                }else{
                    System.out.println("Valor inválido");
                }
               break;
            case 2:
                System.out.println("Digite um valor para retirar:");
                Double valorSacar = scan.nextDouble();
                if (valorSacar > 0){
                     dinheiroEmConta = (valorSacar - dinheiroEmConta);
                    System.out.println("Saque realizado com sucesso!"
                            + "Saldo atual: "+ dinheiroEmConta);
                }else{
                    System.out.println("Valor inválido");
                }
                break;
            case 3:
                if(dinheiroEmConta >= 0 ){
                    System.out.println(
                            String.format("""
                                       Saldo atual: %.2f
                                       Mês 1: %.2f
                                       Mês 2: %.2f
                                       Mês 3: %.2f
                                       Mês 4: %.2f
                                       Mês 5: %.2f
                                       Mês 6: %.2f
                                       Mês 7: %.2f
                                       Mês 8: %.2f
                                       Mês 9: %.2f
                                       Mês 10: %.2f
                                       Mês 11: %.2f
                                       Mês 12: %.2f
                                       """, dinheiroEmConta,
                                       (dinheiroEmConta *0.1)+dinheiroEmConta,
                                       (dinheiroEmConta *0.2)+dinheiroEmConta,
                                       (dinheiroEmConta *0.3)+dinheiroEmConta,
                                       (dinheiroEmConta *0.4)+dinheiroEmConta,
                                       (dinheiroEmConta *0.5)+dinheiroEmConta,
                                       (dinheiroEmConta *0.6)+dinheiroEmConta,
                                       (dinheiroEmConta *0.7)+dinheiroEmConta,
                                       (dinheiroEmConta *0.8)+dinheiroEmConta,
                                       (dinheiroEmConta *0.9)+dinheiroEmConta,
                                       (dinheiroEmConta *1)+dinheiroEmConta,
                                       (dinheiroEmConta *1.1)+dinheiroEmConta,
                                       (dinheiroEmConta *1.2)+dinheiroEmConta
                                       ));
                } else{
                    System.out.println("Saldo zerado, opção inválida");
                }
                break;
            case 0:
                break;
        }
        
    } while(escolha != 0);
}
}
