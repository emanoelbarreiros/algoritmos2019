package estruturas;

public class Elemento {
	
	private Pessoa valor;
	private Elemento proximo;
	
	public Elemento(Pessoa valor) {
		this.valor = valor;
	}
	
	public Pessoa getValor() {
		return valor;
	}
	public void setValor(Pessoa valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	

}
