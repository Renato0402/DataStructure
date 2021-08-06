
public class Hash {

	private int elemento;
	private int valorElemento;
	private Hash proximo;
	
	public Hash(int elemento,int valorElemento) {
		
		this.elemento = elemento;
		this.valorElemento = valorElemento;
		proximo = null;
		
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public int getValorElemento() {
		return valorElemento;
	}

	public void setValorElemento(int valorElemento) {
		this.valorElemento = valorElemento;
	}

	public Hash getProximo() {
		return proximo;
	}

	public void setProximo(Hash proximo) {
		this.proximo = proximo;
	}
	
	
}
