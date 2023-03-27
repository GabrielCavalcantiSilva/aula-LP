/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.atividade02.ac01;

/**
 *
 * @author gabrielcsilva
 */
public class DescontoProgressivo {
    Double valorCmDesc;
    Double valorTotal;
    Double calcularDesconto(Double valorUni, Integer qtdProdu){
        if (qtdProdu == 1){
            valorTotal = (valorUni*qtdProdu);
            Double desc = valorTotal * 0.1;
            valorCmDesc = valorTotal - desc;
            
        } else if(qtdProdu == 2){
            valorTotal = (valorUni*qtdProdu);
            Double desc = valorTotal * 0.2;
            valorCmDesc = valorTotal - desc;
        } else if(qtdProdu == 3){
            valorTotal = (valorUni*qtdProdu);
            Double desc = valorTotal * 0.3;
            valorCmDesc = valorTotal - desc;
        }
        return(valorCmDesc);
    };
    void exibirNotaFiscal(Integer qtdProdu) {
    String notaFiscal = String.format("""
                                      Valor do  produto: %.2f
                                      Quantidade: %d
                                      
                                      valor com desconto = %.2f
                                      """, valorTotal, qtdProdu, valorCmDesc);
    
        System.out.println(notaFiscal);
}

}
