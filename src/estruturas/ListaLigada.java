package estruturas;

public class ListaLigada {
	
	private Elemento inicio;
	
	public void inserirInicio(Pessoa pessoa) {
		Elemento elemento = new Elemento(pessoa);
		elemento.setProximo(inicio);
		inicio = elemento;
	}
	
	public void inserirFim(Pessoa pessoa) {
		if (inicio == null) {
			Elemento elemento = new Elemento(pessoa);
			inicio = elemento;
		} else {
			Elemento item = inicio;
			while (item.getProximo() != null) {
				item = item.getProximo();
			}
			Elemento elemento = new Elemento(pessoa);
			item.setProximo(elemento);
		}
	}
	
	public Pessoa remover(String chave) {
		return null;
	}

}
