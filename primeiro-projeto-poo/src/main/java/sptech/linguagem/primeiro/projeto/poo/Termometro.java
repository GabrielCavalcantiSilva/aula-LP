/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    void aumentaTemperatura(Double valorTemperatura){
        if((temperaturaAtual + valorTemperatura) >= temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }else {
            temperaturaAtual = valorTemperatura;
        }
        
    }
    void diminuiTemperatura (Double valorTemperatura){
        if((temperaturaAtual - valorTemperatura) < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = valorTemperatura;
        }
    }
    void exibeFahreinheit (){
        Double fahreinheit;
        
        fahreinheit = temperaturaAtual * 1.8 +32;
        
        System.out.println(fahreinheit);
    }
}
