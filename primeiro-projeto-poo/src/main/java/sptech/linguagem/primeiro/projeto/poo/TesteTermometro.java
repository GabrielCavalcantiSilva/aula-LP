/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro();
        
        termometro01.temperaturaAtual = 0.0;
        termometro01.temperaturaMax = 50.0;
        termometro01.temperaturaMin = 10.0;
        
        System.out.println(termometro01.temperaturaAtual);
        
        termometro01.aumentaTemperatura(60.0);
        
        System.out.println(termometro01.temperaturaAtual);
        
        termometro01.diminuiTemperatura(50.0);
        
        System.out.println(termometro01.temperaturaAtual);
        
        System.out.println("--------------");
        termometro01.aumentaTemperatura(20.0);
        termometro01.exibeFahreinheit();
        System.out.println("--------------");
    }
}
