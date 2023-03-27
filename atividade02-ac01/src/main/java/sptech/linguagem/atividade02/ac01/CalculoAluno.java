/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.atividade02.ac01;

/**
 *
 * @author gabrielcsilva
 */
public class CalculoAluno {
    void media (Double nota01,Double nota02){
        Double mediaCalculada=(nota01*0.4)+(nota02*0.6);
        System.out.println(String.format("Este aluno tem a nota de: %.2f", mediaCalculada));
    }
}
