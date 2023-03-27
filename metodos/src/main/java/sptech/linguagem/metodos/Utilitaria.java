/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.metodos;

/**
 *
 * @author gabrielcsilva
 */
public class Utilitaria {

    /*
//-----Métodos-----\\
    Retorno: para o método não devolver retorno utilizar void;
    Nome: camelCase;
    Argumentos: Dentro dos ();
    Corpo: o código em si,dentro dos {};
    Instanciar para transformar em objeto
     */

    // método sem argumento
    void exibirLinha() {
        System.out.println("*-----*-----*-----*");
    }
    // método com argumento
    void exibirNome(String nome) {
        System.out.println("Meu nome é: " + nome);
    }
    // método dentro de método
    void exibirNomeFormatado(String nome) {
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }

}
