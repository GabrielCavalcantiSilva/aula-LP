/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.primeiro.projeto.poo;

/**
 *
 * @author gabrielcsilva
 */
public class Encomenda {
    String tamanho;
    String enderecoRemetente = "Avestruz petiça";
    String enderecoDestinatário;
    Double distancia;
    Double valorEncomenda;
    
    Double calcularFrete(){
            Double valorFreteTamanho;
            Double valorFrete;
        if (tamanho.equalsIgnoreCase("P")){
            valorFreteTamanho = valorEncomenda*0.01;
        }else if (tamanho.equalsIgnoreCase("M")){
            valorFreteTamanho = valorEncomenda*0.03;
        } else {
            valorFreteTamanho = valorEncomenda*0.05;
        }
            Double valorFreteDistancia;
        if (distancia <= 50.0){
            valorFreteDistancia = 3.0;
        }else if(distancia <=200.0){
            valorFreteDistancia = 5.0;
        }else{
            valorFreteDistancia = 7.0;
        }
        
        valorFrete = valorFreteDistancia + valorFreteTamanho;  
        
    return valorFrete;
    }
    
    void emitirEtiqueta(Double valorFrete) {
        System.out.println(String.format("""
                                         ***ETIQUETA PARA ENVIO***
                                         Endereço do remetente: %s
                                         Endereço do destinatário: %s
                                         Tamanho: %s
                                         ----------------------------
                                         Valor da encomenda: R$%.2f
                                         Valor do frete: R$%.2f
                                         ----------------------------
                                         Valor total: %.2f
                                         """, enderecoRemetente, enderecoDestinatário,
                                         tamanho, valorEncomenda,valorFrete,(valorFrete+valorEncomenda)));
    }
}
