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
				switch(opcao) {
				case 1:
					Processo.registrarProduto();
                break;
				case 2:
                    Processo.pesquisarProduto();
                break;
				case 3:
					Processo.imprimir();
				break;
                case 4:
					JOptionPane.showMessageDialog(null, "Selmini, infelizmente não sabemos\ncomo remover um elemento... 😢", "Dá nota se for humilde 😭", JOptionPane.ERROR_MESSAGE
					);
				break;
                case 5:
					Processo.altura();
                    JOptionPane.showMessageDialog(null, "Finalizado, Beijos Selmini! 💖\nAmamos ter aula com você e sentiremos saudades!", "😘 Finalizado 😘", JOptionPane.INFORMATION_MESSAGE);
                break;
				}
			}
		} while(opcao != 5);

	}

}


