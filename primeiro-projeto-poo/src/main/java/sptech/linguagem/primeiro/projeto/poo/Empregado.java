/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double porcemReajuste){
        salario += (salario*porcemReajuste);
    }
    
}
