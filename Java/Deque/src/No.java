
public class No {

	private No proximo;
	private int numero;
	
	public No(int numero) {
		
		this.proximo = null;
		this.numero = numero;
		
		
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
