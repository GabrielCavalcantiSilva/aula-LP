/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.lista.exercicio02;

import java.util.Scanner;

/**
 *
 * @author Cocod
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer votoMuss = 0;
        Integer votoCala = 0;
        Integer votoQuei = 0;
        Integer totalVoto = 0;

        do {
            System.out.println("Vote no seu sabor de pizza favorito\n"
                    + "Vote 5 para mussarela\n"
                    + "Vote 25 para calabresa\n"
                    + "Vote 50 para quatro queijos");
            Integer voto = leitor.nextInt();
            switch (voto) {
                case 5:
                    votoMuss++;
                    totalVoto++;
                    break;
                case 25:
                    votoCala++;
                    totalVoto++;
                    break;
                default:
                    votoQuei++;
                    totalVoto++;
                    break;
            }
        } while (totalVoto < 10);

        
    
    if(votoMuss > votoCala && votoMuss > votoQuei){
        System.out.println(String.format("""
 A pizza de Mussarela recebeu %d de votos
A pizza de calabresa recebeu %d de votos
A pizza de quatro queijos recebeu %d de votos
A pizza vencedora foi a de Mussarela""", votoMuss, votoCala, votoQuei
        ));
    }else if(votoCala > votoMuss && votoCala > votoQuei){
        System.out.println(String.format("""
 A pizza de Mussarela recebeu %d de votos
A pizza de calabresa recebeu %d de votos
A pizza de quatro queijos recebeu %d de votos
A pizza vencedora foi a de Calabresa""", votoMuss, votoCala, votoQuei
        ));
    }else{
        System.out.println(String.format("""
 A pizza de Mussarela recebeu %d de votos
A pizza de calabresa recebeu %d de votos
A pizza de quatro queijos recebeu %d de votos
A pizza vencedora foi a de quatro queijos""", votoMuss, votoCala, votoQuei
        ));
    }
        
        
    }

}
