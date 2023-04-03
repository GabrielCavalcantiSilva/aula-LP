/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.poo.encapsulamento;

/**
 *
 * @author gabrielcsilva
 */
public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador func01 = new Colaborador();
        func01.setNome("Bagyr");
        func01.setCargo("Psicóloga");
        func01.setSalario(5500.00);
        
        Colaborador func02 = new Colaborador();
        func02.setNome("Bagibreu");
        func02.setCargo("Desenvolvedor Java Sênior");
        func02.setSalario(12000.0);
        
        RecursosHumanos controleCasa = new RecursosHumanos();
        controleCasa.setSalariosReajustados(0);
        controleCasa.setTotalPromovidos(0);
        
        System.out.println("-------------///-------------Testes-------------///-------------");
        System.out.println("-------------///-------------Mostrar funcionarios-------------///-------------");
        System.out.println(func01.getNome());
        System.out.println(func01.getCargo());
        System.out.println(func01.getSalario());
        
        System.out.println(func02.getNome());
        System.out.println(func02.getCargo());
        System.out.println(func02.getSalario());
        System.out.println("-------------///-------------Mostrar funcionarios-------------///-------------");
        System.out.println("-------------///-------------Promover funcionários-------------///-------------");        
        controleCasa.promoverFunc("Desenvolvedor Java Pleno", func02, 16000.00);
        controleCasa.promoverFunc("Coordenadora de Psicologia", func01, 8000.00);
        System.out.println("-------------///-------------Promover funcionários-------------///-------------");
        System.out.println("-------------///-------------Reajuste salário-------------///-------------");        
        controleCasa.reajustarSalario(8800.00, func01);
        System.out.println("-------------///-------------Reajuste salário-------------///-------------");
        System.out.println("-------------///-------------Mostrar valores atualizados-------------///-------------");        
        System.out.println(func01.getNome());
        System.out.println(func01.getCargo());
        System.out.println(func01.getSalario());
        
        System.out.println(func02.getNome());
        System.out.println(func02.getCargo());
        System.out.println(func02.getSalario());
        System.out.println("-------------///-------------Mostrar valores atualizados-------------///-------------");
        
        System.out.println(controleCasa.getSalariosReajustados());
        System.out.println(controleCasa.getTotalPromovidos());
        System.out.println("-------------///-------------Fim testes-------------///-------------");

    }
}
