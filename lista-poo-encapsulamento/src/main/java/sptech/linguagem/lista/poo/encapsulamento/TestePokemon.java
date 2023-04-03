/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.poo.encapsulamento;

/**
 *
 * @author gabrielcsilva
 */
public class TestePokemon {
    public static void main(String[] args) {
        Pokémon pokemon01 = new Pokémon();
        pokemon01.setDoces(0.0);
        pokemon01.setNome("Charmander");
        pokemon01.setForca(15.0);
        pokemon01.setTipo("Fogo");
        
        Pokémon pokemon02 = new Pokémon();
        pokemon02.setDoces(0.0);
        pokemon02.setNome("Mudkip");
        pokemon02.setForca(20.0);
        pokemon02.setTipo("Água");
        
        TreinadorPokémon treinador01 = new TreinadorPokémon();
        treinador01.setNivel(0.0);
        treinador01.setNome("Ash");
        
        TreinadorPokémon treinador02 = new TreinadorPokémon();
        treinador02.setNivel(0.0);
        treinador02.setNome("Red");
        
        treinador02.treinarPokemon(pokemon02);
        treinador02.treinarPokemon(pokemon02);
        treinador02.treinarPokemon(pokemon02);
        treinador02.treinarPokemon(pokemon02);
        treinador02.treinarPokemon(pokemon02);

        System.out.println(String.format("""
                                         Pokémon: %s
                                         Força: %.2f
                                         Doces: %.1f
                                         """, pokemon02.getNome(), pokemon02.getForca(),
                                         pokemon02.getDoces()));
        treinador02.evoluirPokemon(pokemon02, "Swampert");
        System.out.println(String.format("""
                                         Pokémon: %s
                                         Força: %.2f
                                         Doces: %.1f
                                         """, pokemon02.getNome(), pokemon02.getForca(),
                                         pokemon02.getDoces()));
        
        treinador01.treinarPokemon(pokemon01);
        treinador01.treinarPokemon(pokemon01);
        System.out.println(String.format("""
                                         Pokémon: %s
                                         Força: %.2f
                                         Doces: %.1f
                                         """, pokemon01.getNome(), pokemon01.getForca(),
                                         pokemon01.getDoces()));
        treinador01.evoluirPokemon(pokemon01, "Charmeleon");
                System.out.println(String.format("""
                                         Treinador: %s
                                         Nível: %.2f
                                         """, treinador01.getNome(), treinador01.getNivel()));
                System.out.println(String.format("""
                                         Treinador: %s
                                         Nível: %.2f
                                         """, treinador02.getNome(), treinador02.getNivel()));
        
    }
}
