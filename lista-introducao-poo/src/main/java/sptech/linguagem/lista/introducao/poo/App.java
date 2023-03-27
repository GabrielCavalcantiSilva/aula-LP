/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.introducao.poo;

/**
 *
 * @author gabrielcsilva
 */
public class App {
    public static void main(String[] args) {
    Bolo bolo01 = new Bolo();
    bolo01.sabor = "Chocolate";
    bolo01.valor = 30.0;
    bolo01.qtdVendida = 0;
    
    Bolo bolo02 = new Bolo();
    bolo02.sabor = "Baunilha";
    bolo02.valor = 35.0;
    bolo02.qtdVendida = 0;
    
    Bolo bolo03 = new Bolo();
    bolo03.sabor = "Red Velvet";
    bolo03.valor = 50.0;
    bolo03.qtdVendida = 0;
    
    
    bolo01.comprarBolo(5);
    bolo01.comprarBolo(30);
    bolo01.comprarBolo(50);
    bolo01.comprarBolo(10);
    bolo01.comprarBolo(2);
    bolo01.exibirRelatorio();
    
    
    bolo02.comprarBolo(4);
    bolo02.comprarBolo(30);
    bolo02.comprarBolo(1);
    bolo02.comprarBolo(10);
    bolo02.comprarBolo(5);
    bolo02.exibirRelatorio();
    
    bolo03.comprarBolo(5);
    bolo03.comprarBolo(20);
    bolo03.comprarBolo(5);
    bolo03.comprarBolo(20);
    bolo03.comprarBolo(5);
    bolo03.exibirRelatorio();
    }
}
