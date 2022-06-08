package Exercicio;

public class No {

	Produto p;
	No esq, dir;
	
	public No(Produto produto) {
		this.p = produto;
	}

	public int inserirNo(Produto produto,int altura){
        if(produto.getCodigo() > p.getCodigo()){
            if(dir == null){            
                dir = new No(produto);
                return altura +1 ;
            } else{
                altura++;
                return dir.inserirNo(produto,altura);
            }
        } else{
                if(esq == null){
                    esq = new No(produto);
                    return altura + 1;
                } else{
                    altura++;
                    return esq.inserirNo(produto,altura);
                }
            }
        }
	
	
	
}

