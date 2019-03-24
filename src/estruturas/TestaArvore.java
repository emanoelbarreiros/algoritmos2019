package estruturas;

public class TestaArvore {
	
	public static void main(String[] args) {
		Arvore<Integer, Pessoa> arvore = new Arvore<Integer, Pessoa>();
		
		Pessoa p1 = new Pessoa("emanoel", 180);
		Pessoa p2 = new Pessoa("davi", 104);
		Pessoa p3 = new Pessoa("helaine", 171);
		Pessoa p4 = new Pessoa("livia", 75);
		
		arvore.inserir(new No<Integer, Pessoa>(p3.getAltura(), p3));
		arvore.inserir(new No<Integer, Pessoa>(p1.getAltura(), p1));
		arvore.inserir(new No<Integer, Pessoa>(p2.getAltura(), p2));
		arvore.inserir(new No<Integer, Pessoa>(p4.getAltura(), p4));
		
		arvore.imprimirPreOrdem();
	}

}
