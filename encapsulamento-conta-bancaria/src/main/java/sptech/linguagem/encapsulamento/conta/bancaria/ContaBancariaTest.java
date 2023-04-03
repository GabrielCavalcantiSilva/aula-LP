/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.encapsulamento.conta.bancaria;

/**
 *
 * @author gabrielcsilva
 */
public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("Garibreu");
        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Bagybreli");
        
        System.out.println("Teste C1");
        conta01.sacar(10.0);
        conta01.depositar(20.0);
        conta01.sacar(5.0);
        System.out.println(conta01.getSaldo());
        
        System.out.println("Teste C2");
        conta02.depositar(500.0);
        conta02.sacar(150.0);
        conta02.depositar(-200.00);
        System.out.println(conta02.getSaldo());

    }
}
