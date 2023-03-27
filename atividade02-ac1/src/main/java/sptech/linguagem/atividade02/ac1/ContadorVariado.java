/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.lista.exercicio02;

/**
 *
 * @author Cocod
 */
public class ContadorVariado {
    public static void main(String[] args) {
        for(Double i = 0.15; i < 5; i+= 0.15){
            System.out.println(String.format("%.2f", i));
        }
    }
}
