/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Tulio E
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scany = new Scanner(System.in);
        
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
        
        
        
        // começando o menu
        
        boolean breakpoint = false;
        System.out.println("---------------------------------------");
        System.out.println("Bem vindo ao TicketRural™");
        String entrada = "";
         while(breakpoint == false){
             /**
              * fazer o crud no menu e as funçoes
              * Criar OK
              * Ler
              * Editar
              * Apagar
              */
             System.out.println("Por favor escolha [Criar] [func2] [func3] ou digite esc para sair");
             entrada = scany.nextLine();
             if(entrada.toLowerCase().equals("esc")){ // comando de saida do menu.
                 breakpoint = true;
                 break;
             }
             if(entrada.toLowerCase().equals("criar")){
                    criar();
                    
                 }
             
         }
         

         
    }
    //funçao de criar do crud
        public static void criar(){
    
        Scanner scany = new Scanner(System.in);
        System.out.println("Criando evento");
        
            System.out.println("--------------------------------------");
            
        System.out.println("nome evento");
        String nome_evento = scany.nextLine();
        
            System.out.println("--------------------------------------");
            
        System.out.println("tipo evento");
        String tipo_evento = scany.nextLine();  
        
            System.out.println("--------------------------------------");
            
        System.out.println("data evento");
        String data_evento = scany.nextLine();
        
            System.out.println("--------------------------------------");
            
        System.out.println("preco evento");
        String preco_evento = scany.nextLine();
        
            System.out.println("--------------------------------------");
            
        System.out.println("preco da meia evento");
        String preco_meia_evento = scany.nextLine();
        
            System.out.println("--------------------------------------");
            
        System.out.println("quantidade de vagas evento");
        String quantidade_evento = scany.nextLine();
        
            System.out.println("--------------------------------------");
               System.out.println("Evento: " + nome_evento + " Tipo: " + tipo_evento + " Data: " + data_evento +
                           " Preco: " + preco_evento + " Preco da Meia: " + preco_meia_evento + 
                           " Quantidade: " + quantidade_evento);
               
               
               

        
        }
        

            
            

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
        
        
}
        
        



    

 

