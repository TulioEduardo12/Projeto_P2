/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO;

/**
 *
 * @author Tulio E
 */
abstract class Ingresso {
   double preco;
   String tipo;
   private int numeroAssento;
   

    public Ingresso(double preco, String tipo, int numeroAssento) {
        this.preco = preco;
        this.tipo = tipo;
        this.numeroAssento = numeroAssento;
        
    }

    abstract public double calcularTributo(double IBPT);
    abstract public double fatorProximidade(int fileira);
   
    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public void mostrarDetalhes() {
            System.out.println("Preco do ingresso: " + preco);
            System.out.println("Tipo: "+ tipo);
    }
   
    
            
  
   
}
