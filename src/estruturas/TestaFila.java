package estruturas;

public class TestaFila {
	
	public static void main(String[] args) {
		Fila f = new Fila(4);
		
		f.inserir(1);
		f.inserir(2);
		f.inserir(3);
		f.inserir(4);
		
		f.imprimirConteudo();
		
		System.out.println(f.remover());
		System.out.println(f.remover());
		
		f.imprimirConteudo();
		
		f.inserir(7);
		
		f.imprimirConteudo();
	}

}
