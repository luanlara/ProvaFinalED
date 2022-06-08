package Exercicio;

import javax.swing.JOptionPane;

public class Processo {

    static ArvoreBinaria av = new ArvoreBinaria();

    public static String menu() {
		
		String aux = "Escolha uma opção:\n";
		aux += "1. Registrar produto\n";
		aux += "2. Pesquisar produto\n";
		aux += "3. Listar produtos\n";
		aux += "4. Remover produto\n";
        aux += "5. Finalizar\n";
		return aux;
	}

    public static void registrarProduto() {
		int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código do produto:"));
        Produto produto = new Produto(codigo);

        String nome;
        double valor;
        int qtd;

        nome = JOptionPane.showInputDialog("Nome do produto:");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto:"));
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de estoque:"));

        if(qtd <= 0) {
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade não compatível. \n Quantidade de produtos precisa ser maior que 0:"));
        }

        Produto prod = new Produto(codigo, nome, valor, qtd);
        av.inserir(prod);
    
    }    	

    public static void pesquisarProduto() {
        if(av.getRaiz() == null) {
            JOptionPane.showMessageDialog(null, "Não há produtos registrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código do produto:"));
            av.pesquisar(codigo);
        }  
    }

    public static void imprimir() {
        if (av.getRaiz() == null) {
            JOptionPane.showMessageDialog(null, "Não há produtos registrados");
        } else {
            av.imprimirPreOrdem();
        }
    }

    public static void altura() {
        av.altura();
    }

}
