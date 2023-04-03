/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.poo.encapsulamento;

/**
 *
 * @author gabrielcsilva
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer salariosReajustados;

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getSalariosReajustados() {
        return salariosReajustados;
    }

    public void setSalariosReajustados(Integer salariosReajustados) {
        this.salariosReajustados = salariosReajustados;
    }

    
    
    
    public void reajustarSalario(Double salarioReajuste, Colaborador func) {
        if (salarioReajuste <= 0) {
            System.out.println("Valor inválido");
        } else {
            func.setSalario(salarioReajuste);
            System.out.println("Salario reajustado!");
            salariosReajustados += 1;
        }
    }

    public void promoverFunc(String novoCargo, Colaborador func, Double novoSalario) {
                if (novoSalario < func.getSalario()) {
                    System.out.println("Operação inválida!\n Insira um salário válido!");
                } else {
                    func.setSalario(novoSalario);
                    func.setCargo(novoCargo);
                    totalPromovidos += 1;
                    System.out.println("Funcionário promovido com sucesso!");
                }
            }
        }
