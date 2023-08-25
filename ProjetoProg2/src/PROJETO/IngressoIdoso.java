/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJETO;

/**
 *
 * @author Tulio E & Matheus D
 */
public class IngressoIdoso extends Ingresso{
    private int idade;
    private int numeroCarteiraIdoso;

    public IngressoIdoso(int idade, double preco, String tipo, int numeroAssento) {
        super(preco, tipo, numeroAssento);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroCarteiraIdoso() {
        return numeroCarteiraIdoso;
    }

    public void setNumeroCarteiraIdoso(int numeroCarteiraIdoso) {
        this.numeroCarteiraIdoso = numeroCarteiraIdoso;
    }
    
    

      public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ingresso de idoso");
        System.out.println("Idade: " + idade + " anos");
        
              
    }  
      
    @Override
    public double calcularTributo(double IBPT){
        return (0.01 * IBPT); //sem imposto pra idoso
    }
    
    @Override
    public double fatorProximidade(int fileira){
        return ((1 / fileira)* 1.25);
    }
}
