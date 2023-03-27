/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.cargo = "Analista de Sistemas";
        empregado01.salario = 5400.00;
        empregado01.reajustarSalario(0.15);
        System.out.println(String.format("""
                                         O empregado %s é um %s e recebe %.2f
                                         """, empregado01.nome, empregado01.cargo, empregado01.salario));
        
       Empregado empregado02 = new Empregado();
       empregado02.nome = "Gabriel";
       empregado02.cargo = "Desenvolvedor Sênior";
       empregado02.salario = 10000.00;
       empregado02.reajustarSalario(0.15);
       System.out.println(String.format("""
                                         O empregado %s é um %s e recebe %.2f
                                         """, empregado02.nome, empregado02.cargo, empregado02.salario));
        
    }
}
