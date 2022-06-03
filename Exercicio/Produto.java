package Exercicio;

public class Produto {
    
    private int codigo;
    private String nome;
    private double valor;
    private int qtd;

    public Produto(int codigo, String nome, double valor, int qtd) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public double getValor() {
        return valor;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nNome: " + nome+ "\nValor: " + valor + "\nQuantidade em estoque: " + qtd;
    }

}
