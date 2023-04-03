/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.linguagem.lista.poo.encapsulamento;

/**
 *
 * @author gabrielcsilva
 */
public class TreinadorPokémon {
    private String nome;
    private Double nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }
    
    public void treinarPokemon (Pokémon pokemon){
        pokemon.setForca(pokemon.getForca() * 1.10);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2.0;
    }
    
    public void evoluirPokemon (Pokémon pokemon, String nomeEvolucao){
        if(pokemon.getDoces() >= 50){
            System.out.println(String.format("""
                                             O pokémon %s evoluiu para -> %s
                                             """, pokemon.getNome(), nomeEvolucao));
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50.0);
            nivel += 10;
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }
}
