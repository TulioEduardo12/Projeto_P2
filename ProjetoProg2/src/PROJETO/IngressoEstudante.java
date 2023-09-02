package PROJETO;

/**
 *
 * @author Tulio E
 */
public class IngressoEstudante extends Ingresso{
    String Instituicao;


    public IngressoEstudante(String Instituição, double preco, String tipo, int numeroAssento) {
        super(preco, tipo, numeroAssento);
        this.Instituicao = Instituição;
    }

    public String getInstituicao() {
        return Instituicao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setInstituição(String Instituição) {
        this.Instituicao = Instituição;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
       public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ingresso de estudante");
        System.out.println("Instituicao: " + Instituicao);
           System.out.println("------------------");
    } 
    
       @Override
    public double calcularTributo(double IBPT){
        return (0.01 * IBPT);
    }
    
    @Override
    public double fatorProximidade(int fileira){
        return ((1 / fileira)* 1.25);
    }
       
}
