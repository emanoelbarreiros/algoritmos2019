package estruturas;

public class No<C extends Integer, I> {
	
	private C chave;
	private I item;
	
	private No<C, I> predecessor;
	
	private No<C, I> esquerda;
	private No<C, I> direita;
	
	public No(C chave, I item) {
		this.chave = chave;
		this.item = item;
	}
	
	public C getChave() {
		return chave;
	}
	
	public No<C, I> getEsquerda() {
		return esquerda;
	}
	
	public No<C, I> getDireita() {
		return direita;
	}

	public I getItem() {
		return item;
	}

	public void setItem(I item) {
		this.item = item;
	}

	public No<C, I> getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(No<C, I> predecessor) {
		this.predecessor = predecessor;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public void setEsquerda(No<C, I> esquerda) {
		this.esquerda = esquerda;
	}

	public void setDireita(No<C, I> direita) {
		this.direita = direita;
	}
	

}
