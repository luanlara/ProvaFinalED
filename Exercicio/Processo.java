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

        if(av.pesquisar(codigo) == null){
            String nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
            if (valor > 0) {
                int estoque = Integer.parseInt(JOptionPane.showInputDialog("Informe o estoque do produto: "));
                if(estoque > 0){
                    Produto produto = new Produto(codigo, nome, valor, estoque);
                    av.inserir(produto);
                    JOptionPane.showMessageDialog(null, "Produto cadastrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número de quantidade de estoque deve ser maior que zero!", "Erro",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "O valor deve ser maior que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
            }   
        } else {
            JOptionPane.showMessageDialog(null, "Código já existente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
       	

    public static void pesquisarProduto() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: "));

        if(av.pesquisar(codigo) == null ){
            JOptionPane.showMessageDialog(null, "Não há produtos registrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "       PRODUTO       \n"+ av.pesquisar(codigo).p);
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
