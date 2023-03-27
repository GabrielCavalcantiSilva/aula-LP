/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class EncomendaTest {
    public static void main(String[] args) {
        Encomenda etiqueta01 = new Encomenda();
        etiqueta01.enderecoDestinatário = "Rua joãozinho";
        etiqueta01.tamanho = "P";
        etiqueta01.valorEncomenda = 200.0;
        etiqueta01.distancia = 30.0;
        
        Encomenda etiqueta02 = new Encomenda();
        etiqueta02.enderecoDestinatário = "Rua Mariazinha";
        etiqueta02.tamanho = "M";
        etiqueta02.valorEncomenda = 150.0;
        etiqueta02.distancia = 150.0;
        
        Encomenda etiqueta03 = new Encomenda();
        etiqueta03.enderecoDestinatário = "Rua Manoelzinho";
        etiqueta03.tamanho = "G";
        etiqueta03.valorEncomenda = 300.0;
        etiqueta03.distancia = 500.0;
        
        Double frete01 = etiqueta01.calcularFrete();
        Double frete02 = etiqueta02.calcularFrete();
        Double frete03 = etiqueta03.calcularFrete();
        
        etiqueta01.emitirEtiqueta(frete01);
        etiqueta02.emitirEtiqueta(frete02);
        etiqueta03.emitirEtiqueta(frete03);
    }
}
