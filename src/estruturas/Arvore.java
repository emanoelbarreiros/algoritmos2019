package estruturas;

public class Arvore<C extends Integer, T> {
	
	private No<C, T> raiz;
	
	public void inserir(No<C, T> no) {
		No<C, T> anterior = null;
		No<C, T> atual = raiz;
		
		while (atual != null) {
			anterior = atual;
			if (no.getChave() < atual.getChave()) {
				atual = atual.getEsquerda();
			} else {
				atual = atual.getDireita();
			}
		}
		no.setPredecessor(anterior);
		if (anterior == null) {
			raiz = no;
		} else if (no.getChave() < anterior.getChave()) {
			anterior.setEsquerda(no);
		} else {
			anterior.setDireita(no);
		}
	}
	public void imprimirEmOrdem(No<C, T> no) {
		if (no != null) {
			imprimirEmOrdem(no.getEsquerda());
			System.out.println(no.getChave());
			imprimirEmOrdem(no.getDireita());
		}
	}
	
	public void imprimirPreOrdem(No<C, T> no) {
		if (no != null) {
			System.out.println(no.getChave());
			imprimirPreOrdem(no.getEsquerda());
			imprimirPreOrdem(no.getDireita());
		}
	}
	
	public void imprimirPosOrdem(No<C, T> no) {
		if (no != null) {
			imprimirPosOrdem(no.getEsquerda());
			imprimirPosOrdem(no.getDireita());
			System.out.println(no.getChave());
		}
	}
	
	public void imprimirEmOrdem() {
		if (raiz != null) {
			imprimirEmOrdem(raiz.getEsquerda());
			System.out.println(raiz.getChave());
			imprimirEmOrdem(raiz.getDireita());
		}
	}
	
	public void imprimirPreOrdem() {
		if (raiz != null) {
			System.out.println(raiz.getChave());
			imprimirPreOrdem(raiz.getEsquerda());
			imprimirPreOrdem(raiz.getDireita());
		}
	}
	
	public void imprimirPosOrdem() {
		if (raiz != null) {
			imprimirPosOrdem(raiz.getEsquerda());
			imprimirPosOrdem(raiz.getDireita());
			System.out.println(raiz.getChave());
		}
	}

}
