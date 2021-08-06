
public class HashMap {

	private int tamanho;

	Hash [] vetor;

	public HashMap(int tamanho) {

		this.tamanho = tamanho;

		vetor = new Hash[tamanho];

		for(int i = 0; i < tamanho; i++) {

			vetor[i] = null;
		}
	}

	public void adicionar(int valorElemento,int elemento) {

		int hash = (valorElemento%tamanho);

		while(vetor[hash] != null && vetor[hash].getValorElemento()  != valorElemento) {

			hash = (hash + 1) % tamanho;

		}

		vetor[hash] = new Hash(valorElemento,elemento);
	}

	public void remover(int valorElemento,int elemento) {

		int hash = (valorElemento%tamanho);

		while(vetor[hash] != null && vetor[hash].getValorElemento()  != valorElemento) {

			hash = (hash + 1) % tamanho;

		}

		vetor[hash] = null;
	}
	
	public void exibir() {
		
		for(int i = 0; i < tamanho; i++) {
			
			if(vetor[i] != null) {
				
				System.out.println("Na posição " + i + " tem o numero: " + vetor[i].getElemento());
			}
		}
	}
}
