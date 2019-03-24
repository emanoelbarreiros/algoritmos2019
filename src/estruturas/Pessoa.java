package estruturas;

public class Pessoa {
	
	private String nome;
	private int altura; 
	
	public Pessoa(String nome, int altura) {
		this.nome = nome;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
