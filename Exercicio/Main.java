package Exercicio;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(Processo.menu()));
			if(opcao < 1 || opcao > 6) {
				JOptionPane.showMessageDialog(null, "Opcăo inválida");
			}else {
				ArvoreBinaria aux = new ArvoreBinaria();
				switch(opcao) {
				case 1:
					Processo.registrarProduto();
                break;
				case 2:
                    Processo.pesquisarProduto();
                break;
				case 3:
					
				break;
                case 4:
					
				break;
                case 5:
                    JOptionPane.showMessageDialog(null, "x");
                break;
				}
			}
		} while(opcao != 5);

	}

}


