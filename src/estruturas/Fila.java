package estruturas;

import java.util.Arrays;

public class Fila {

	private int[] valores;
	private int cauda;
	private int tamanho;
	
	public Fila(int tamanho) {
		this.tamanho = tamanho;
		this.cauda = -1;
		this.valores = new int[tamanho];
	}
	
	public void inserir(int elemento)  {
		if (cauda < tamanho - 1) {
			valores[++cauda] = elemento;
		} else {
			throw new PilhaCheiaException();
		}
	}
	
	public int remover() {
		int temp = valores[0];
		for (int i = 1; i <= cauda; i++) {
			valores[i - 1] = valores[i];
		}
		cauda--;
		
		return temp;
	}
	
	public void imprimirConteudo() {
		System.out.println(Arrays.toString(Arrays.copyOf(valores, cauda + 1)));
	}
}








