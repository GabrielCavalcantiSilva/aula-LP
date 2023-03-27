/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.introducao.poo;

import javax.print.DocFlavor;

/**
 *
 * @author gabrielcsilva
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida;

    void comprarBolo(Integer qtdVenda) {
        if ((qtdVendida + qtdVenda) >= 100) {
            System.out.println("Seu pedido ultrapassou a quantidade diária para esse bolo hoje");
        } else if (qtdVendida >= 0) {
            qtdVendida += qtdVenda;
        }
    }

    void exibirRelatorio() {
        System.out.println(String.format("""
                                         O bolo sabor %s, foi comprado: %d vezes hoje, totalizando: %.2f
                                         """, sabor, qtdVendida, (qtdVendida * valor)));
    }
}
