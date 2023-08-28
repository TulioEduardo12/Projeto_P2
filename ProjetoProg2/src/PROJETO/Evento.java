/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tulio E
 */
class Evento {
    private String nome;
    private List<Ingresso> ingressosDisponiveis;

    public Evento(String nome) {
        this.nome = nome;
        this.ingressosDisponiveis = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressosDisponiveis.add(ingresso);
    }

    public void venderIngresso(Usuario usuario, Ingresso ingresso) {
        if (ingressosDisponiveis.contains(ingresso)) {
            System.out.println("Ingresso vendido para o evento " + nome);
            usuario.comprarIngresso(ingresso);
            ingressosDisponiveis.remove(ingresso);
            
        } else {
            System.out.println("Ingresso não disponível para o evento " + nome);
        }
    }
    
    

    
}

