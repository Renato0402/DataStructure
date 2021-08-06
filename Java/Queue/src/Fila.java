
public class Fila {

	private int numero;
	private Fila proximo;

	
	public Fila(int numero) {
		
		this.numero = numero;
		this.proximo = null;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Fila getProximo() {
		return proximo;
	}

	public void setProximo(Fila proximo) {
		this.proximo = proximo;
	}
	
	
}
