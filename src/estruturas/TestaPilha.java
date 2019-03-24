package estruturas;

public class TestaPilha {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha(4);
		
		pilha.push(9);
		pilha.push(3);
		pilha.push(2);
		
		pilha.imprimirConteudo();
		
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}

}
