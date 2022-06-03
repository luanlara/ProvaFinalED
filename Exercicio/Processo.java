package Exercicio;

import javax.swing.JOptionPane;

public class Processo {

    static ArvoreBinaria av = new ArvoreBinaria();

    public static void registrarProduto() {
		int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código do produto:"));
        Produto produto = new Produto(codigo);

        if(av.pesquisar(produto) != null) {
            JOptionPane.showMessageDialog(null, "Esse produto já está cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
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
    }    	

    
    public static String menu() {
		
		String aux = "Escolha uma opção:\n";
		aux += "1. Registrar produto\n";
		aux += "2. Pesquisar produto\n";
		aux += "3. Listar produtos\n";
		aux += "4. Remover produto\n";
        aux += "5. Finalizar\n";
		return aux;
	}


    public static void pesquisarProduto() {
        int codigo;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do produto para pesquisa:"));
        Produto aux = new Produto(codigo);
        // av.pesquisar(codigo, aux);
    }

}
