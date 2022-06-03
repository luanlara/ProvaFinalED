package Exercicio;

public class No {

	Produto p;
	No esq, dir;
	
	public No(Produto produto) {
		this.p = produto;
	}

	public void inserirNo(Produto produto) {
		if(produto.getCodigo() > p.getCodigo()) {
			if(dir == null) {
				dir = new No(p);
			} else {
				dir.inserirNo(produto);
			}
		} else {
			if (produto.getCodigo() < p.getCodigo()) {
				if (esq == null) {
					esq = new No(produto);
				} else {
					esq.inserirNo(produto);
				}
			}
		}
	}
	
	
	
}

