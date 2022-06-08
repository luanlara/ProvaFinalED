package Exercicio;

import javax.swing.JOptionPane;

public class ArvoreBinaria {

	private No raiz;
	private int altura, aux;

	public No getRaiz() {
		return raiz;
	}
	
	public void inserir(Produto p) {
		aux = 0;
		if (raiz == null) {
			raiz = new No(p);
		} else {
			aux = raiz.inserirNo(p, aux);
		}
		if (aux >= altura) {
			altura = aux;
		}

	}
		
	public void emOrdem() {
		emOrdemRecursivo(raiz);
	}
	
	private void emOrdemRecursivo(No raiz) {
		if (raiz == null) {
			return;
		} 
		
		emOrdemRecursivo(raiz.esq);
		System.out.print(raiz.p + " ");
		emOrdemRecursivo(raiz.dir);
		
	}

	/* public void pesquisar(int codigo) {
		No aux = pesquisarRec(codigo, raiz);
		if (aux != null) {
			JOptionPane.showMessageDialog(null, aux.p);
		} else {
			JOptionPane.showMessageDialog(null,"Esse produto não está no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	} */

	public No pesquisar(int codigo) {
        No aux = pesquisarProduto(codigo, this.raiz);
        return aux;
    }

	/*private No pesquisarRec(int codigo, No raiz) {
		if (raiz == null) {
			return null;
		} else if (raiz.p.getCodigo() == codigo) {
			return raiz;
		}
		if (codigo < raiz.p.getCodigo()) {
			return pesquisarRec(codigo, raiz.dir);
		} else {
			return pesquisarRec(codigo, raiz.esq);
		}

	} */

	private No pesquisarProduto(int codigo, No raiz){
        if(raiz == null){
            return null;
        }
        if(codigo == raiz.p.getCodigo()){
            return raiz;
        }
        
        if(codigo > raiz.p.getCodigo()){
            return pesquisarProduto(codigo, raiz.dir);   
        } else {    
            return pesquisarProduto(codigo, raiz.esq);
        }
    }

	public void imprimirPreOrdem() {
		preOrdemRecursivo(raiz);
	}

	private void preOrdemRecursivo(No raiz) {
		if(raiz == null) {
			return;
		}
		
		JOptionPane.showMessageDialog(null, raiz.p + "\n");
		preOrdemRecursivo(raiz.esq);
		preOrdemRecursivo(raiz.dir);
		
	}

	public void altura(){
		JOptionPane.showMessageDialog(null, "A altura da árvore é de: " + altura);
	}	
	
}

