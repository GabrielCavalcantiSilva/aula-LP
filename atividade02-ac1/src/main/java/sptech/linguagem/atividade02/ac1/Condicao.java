/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasdelinguagem.primeiro.projeto.nivelamento;

import com.sun.source.tree.IfTree;

/**
 *
 * @author Cocod
 */
public class Condicao {

    public static void main(String[] args) {
        // > Maior
        // < Menor
        // <= Menor igual
        // >= Maior igual
        // $$ E
        // || Ou

        Integer numero01 = 10;
        Integer numero02 = 42;

        if (numero01 > numero02) {
            System.out.println("É maior!");
        } else if (numero01 < numero02) {
            System.out.println("É menor!");
        } else if (numero01 == numero02) {
            System.out.println("É igual!");
        }

        String nome01 = "Xampson";
        String nome02 = "Xampson";

        if (nome01.equals(nome02)) {
            System.out.println("É igual");
        } else {
            System.out.println("É diferente");
        }

    }
}