package estruturas;

import java.util.Arrays;

public class Pilha {
	
	private int[] valores;
	private int top;
	private int tamanho;
	
	public Pilha(int tamanho) {
		this.tamanho = tamanho;
		this.valores = new int[tamanho];
		this.top = -1;
	}
	
	public void push(int elemento)  {
		if (top < tamanho - 1) {
			valores[++top] = elemento;
		} else {
			throw new PilhaCheiaException();
		}
	}
	
	public int pop() {
		if (top >= 0) {
			return valores[top--];
		} else {
			throw new PilhaVaziaException();
		}
	}
	
	public void imprimirConteudo() {
		System.out.println(Arrays.toString(valores));
	}

}
