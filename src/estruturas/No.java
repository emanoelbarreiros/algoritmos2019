package estruturas;

public class No<C extends Integer, V> {
	
	private C chave;
	private V item;
	private No<C, V> predecessor;
	
	private No<C, V> esquerda;
	private No<C, V> direita;
	
	public No(C chave, V item) {
		this.chave = chave;
		this.item = item;
	}
	
	public C getChave() {
		return chave;
	}
	
	public No<C, V> getEsquerda() {
		return esquerda;
	}
	
	public No<C, V> getDireita() {
		return direita;
	}

	public V getItem() {
		return item;
	}

	public void setItem(V item) {
		this.item = item;
	}

	public No<C, V> getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(No<C, V> predecessor) {
		this.predecessor = predecessor;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public void setEsquerda(No<C, V> esquerda) {
		this.esquerda = esquerda;
	}

	public void setDireita(No<C, V> direita) {
		this.direita = direita;
	}
	

}
