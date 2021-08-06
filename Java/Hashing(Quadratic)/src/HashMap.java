
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

		int i = 0;

		while(vetor[hash] != null && vetor[hash].getValorElemento() != valorElemento && i <=tamanho) {

			hash = (hash + i)%tamanho;
			i++;
		}
		
		if(i <=tamanho)

		vetor[hash] = new Hash(elemento,valorElemento);

	}

	public void remover(int valorElemento,int elemento) {

		int hash = (valorElemento%tamanho);

		int i = 0;

		while(vetor[hash] != null && vetor[hash].getValorElemento() != valorElemento && i <=tamanho) {

			hash = (hash + i)%tamanho;
			i++;
		}

		vetor[hash] = null;

	}
	
	public void buscar(int valorElemento,int elemento) {

		int hash = (valorElemento%tamanho);

		int i = 0;

		while(vetor[hash] != null && vetor[hash].getValorElemento() != valorElemento && i <=tamanho) {

			hash = (hash + i)%tamanho;
			i++;
		}
		
		if(vetor[hash]!= null)

		System.out.println("Numero: " + vetor[hash].getElemento());
		
		System.out.println("Numero não encontrado no hash");

	}
	
	public void exibir() {
		
		for(int i = 0; i < tamanho;i++) {
			
			if(vetor[i] != null) {
				
				System.out.println("Posicao: " + i + "/ Numero: " + vetor[i].getElemento());
			}
		}
	}
}
