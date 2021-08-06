
public class No {

	private int valor;
	private No direita;
	private No esquerda;
	
	public No(int valor) {
		
		this.valor = valor;
		direita = null;
		esquerda = null;
		
	}

	public boolean remover(No n,int valor) {
		
		if(valor < this.valor) {
			
			if(esquerda != null) {
			
			return esquerda.remover(this, valor);
			
			} else {
				
				return false;
			}
			
		} else if(valor > this.valor) {
			
			if(direita != null) {
				
				return direita.remover(this, valor);
				
			} else {
				
				return false;
				
			}
			
		} else {
			
			if(direita!= null && esquerda!= null) {
				
				this.valor = direita.minValue();
				
				direita.remover(this, this.valor);
				
			} else if(n.esquerda == this) {
				
				if(esquerda != null) {
					
					n.esquerda = esquerda;
					
				} else {
					
					n.esquerda = direita;
				}
				
			} else if(n.direita == this) {
				
				if(esquerda != null) {
					
					n.direita = esquerda;
					
				} else {
					
					n.direita = direita;
				}
			}
			
			return false;
		}
	}
	
	public int minValue() {
		
		if(esquerda == null) {
			
			return valor;
			
		} else {
			
			return esquerda.minValue();
					
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	
}
