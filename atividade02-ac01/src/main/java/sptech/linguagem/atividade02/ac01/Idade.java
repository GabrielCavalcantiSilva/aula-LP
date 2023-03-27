/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.atividade02.ac01;

/**
 *
 * @author gabrielcsilva
 */
public class Idade {
    void classificaIdade(Integer idade){
        if (idade < 2 && idade > 0){
            System.out.println("Bebê");
        }else if(idade <12){
            System.out.println("Criança");
        }else if(idade < 20){
                System.out.println("Adolescente");
        }else if(idade < 31){
            System.out.println("Jovem");
        }else if(idade <=60){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
