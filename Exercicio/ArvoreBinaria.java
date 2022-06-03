package Exercicio;

import javax.swing.JOptionPane;

public class ArvoreBinaria {

	private No raiz;
	
	//método para inserir um elemento na árvore binária de busca
	public void inserir(Produto p) {
		if (raiz == null) {
			raiz = new No(p);
		} else {
			raiz.inserirNo(p);
		}
	}
		
	//método para percorrer a árvore em-ordem
	public void emOrdem() {
		emOrdemRecursivo(raiz);
	}
	
	//método auxiliar recursivo para o percurso em-ordem
	private void emOrdemRecursivo(No raiz) {
		if (raiz == null) {
			return;
		} 
		
		emOrdemRecursivo(raiz.esq);
		System.out.print(raiz.p + " ");
		emOrdemRecursivo(raiz.dir);
		
	}
	
	//método para percorrer a árvore na pré-ordem
	public void preOrdem() {
		preOrdemRecursivo(raiz);
	}

	//método auxiliar recursivo para o percurso na pré-ordem
	private void preOrdemRecursivo(No raiz) {
		if(raiz == null) {
			return;
		}
		
		System.out.print(raiz.p + " ");
		preOrdemRecursivo(raiz.esq);
		preOrdemRecursivo(raiz.dir);
		
	}

    public No pesquisar(Produto produto) {
        No aux = raiz;
        boolean encontrou = false;

        while(encontrou == false && aux != null) {
            encontrou = true;
            break;
        }
        return aux;
    }

	
	
}

