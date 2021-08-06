
public class Lista {

	private No primeiro;
	private No ultimo;
	
	public Lista() {
		
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void adicionar(int numero,int prioridade) {
		
		No novo = new No(numero,prioridade);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		} else {
			
			No aux = primeiro;
			
			No anterior = null;
			
			while(aux != null && aux.getPrioridade() < prioridade ) {
				
				anterior = aux;
				aux = aux.getProximo();
			}
			
			if(aux == primeiro) {
				
				novo.setProximo(primeiro);
				primeiro = novo;
				
			} else if(aux == ultimo) {
				
				ultimo.setProximo(novo);
				ultimo = novo;
				
			} else {
				
				anterior.setProximo(novo);
				novo.setProximo(aux);
			}
		}
	}
	
	public void ordena() {
		

		No aux = primeiro;

		int i;
		
		while(aux.getProximo() != null) {
			
			
			
			if(aux.getPrioridade() == aux.getProximo().getPrioridade() && aux.getNumero() > aux.getProximo().getNumero()) {
				
			
			  i = aux.getProximo().getNumero();
				
				aux.getProximo().setNumero(aux.getNumero());
					
				aux.setNumero(i);
			
			
			} else {
				
				aux.setNumero(aux.getNumero());
			}
			

			aux = aux.getProximo();
			
		
		}
	
	}
	
	
	
	public void exibir() {
		
		No aux = primeiro;
		while(aux != null) {
			
			System.out.println(aux.getNumero() + "/Prioridade:" + aux.getPrioridade() + "  ");
			aux = aux.getProximo();
		}
	}
	}

