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
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DescontoProgressivo calcDesconto = new DescontoProgressivo();
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorUni = scan.nextDouble();
        System.out.println("Digite a quantidade de produtos: ");
        Integer qtdProdu = scan.nextInt();
        
        calcDesconto.calcularDesconto(valorUni, qtdProdu);
        calcDesconto.exibirNotaFiscal(qtdProdu);
        
    }
}
