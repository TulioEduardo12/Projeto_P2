/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO;

/**
 *
 * @author Tulio E
 */
public class Main {
    public static void main(String[] args) {

       // IngressoVIP ingressoVIP = new IngressoVIP("VIP", 100.0, "Acesso à área VIP", "Setor A");
        IngressoIdoso ingressoIdoso = new IngressoIdoso(60, 100, "idoso", 9);
        IngressoEstudante ingressoEstudante = new IngressoEstudante("escola", 100, "meia", 10);


        System.out.println("Detalhes do Ingresso Idoso:");
        System.out.println("Tipo: " + ingressoIdoso.getTipo());
        System.out.println("Preco: $" + ingressoIdoso.getPreco());
        System.out.println("Idade do idoso: " + ingressoIdoso.getIdade() + " anos");
        System.out.println();

        System.out.println("Detalhes do Ingresso Estudante:");
        System.out.println("Tipo: " + ingressoEstudante.getTipo());
        System.out.println("Preco: $" + ingressoEstudante.getPreco());
        System.out.println("Instituicao: " + ingressoEstudante.getInstituicao());
    }
}


    

 

