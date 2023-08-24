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
public class Main {
    public static void main(String[] args) {
        Evento eventoConcerto = new Evento("Concerto de Musica");
        Evento eventoFeira = new Evento("Feira de Arte");

        IngressoEstudante ingressoEstudante = new IngressoEstudante("escola", 2, "estudante", 34);
        IngressoIdoso ingressoIdoso = new IngressoIdoso(60, 12, "idoso", 23);

        eventoConcerto.adicionarIngresso(ingressoEstudante);
        eventoFeira.adicionarIngresso(ingressoIdoso);

        Usuario usuario1 = new Usuario("Joao", "123.456.789-00", "joao@example.com");
        Usuario usuario2 = new Usuario("Maria", "987.654.321-00", "maria@example.com");

        eventoConcerto.venderIngresso(usuario1, ingressoEstudante);
        eventoFeira.venderIngresso(usuario2, ingressoIdoso);
    }
}


    

 

