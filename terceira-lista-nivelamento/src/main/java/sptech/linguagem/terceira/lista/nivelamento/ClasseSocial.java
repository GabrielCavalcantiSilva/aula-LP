/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.terceira.lista.nivelamento;

/**
 *
 * @author gabrielcsilva
 */
public class ClasseSocial {
    Double checarQtdSalaMin (Double salarioDigitado){
        Double salario = salarioDigitado;
        return salario / 1045;
    }
    
    String checarClasseSocial (Double qtdSalaMin){
        String classe = "";
        if (qtdSalaMin > 20.0){
            classe = "A";
        }else if(qtdSalaMin >10.0){
            classe= "B";
        } else if(qtdSalaMin > 4.0){
            classe = "C";
        }else if(qtdSalaMin > 2.1){
            classe = "D";
        }else {
            classe = "E";
        }
        return classe;
    };
}
 