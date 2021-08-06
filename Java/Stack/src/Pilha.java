
public class Pilha {

	private int numero;
	private Pilha proximo;
	
	public Pilha(int numero) {
		
		this.numero = numero;
		this.proximo = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pilha getProximo() {
		return proximo;
	}

	public void setProximo(Pilha proximo) {
		this.proximo = proximo;
	}
	
	
}
