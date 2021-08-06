
public class No {

	private int numero;
	private int prioridade;
	private No proximo;
	
	public No(int numero,int prioridade) {
		
		this.numero = numero;
		this.prioridade = prioridade;
		this.proximo = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
