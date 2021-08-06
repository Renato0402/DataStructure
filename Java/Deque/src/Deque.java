
public class Deque {

	private No primeiro;
	private No ultimo;
	
	public Deque() {
		
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void addComeco(int numero) {
		
		No novo = new No(numero);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		} else {
			
			novo.setProximo(primeiro);
			primeiro = novo;
		}
		
	}
	
    public void addFim(int numero) {
		
		No novo = new No(numero);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		} else {
			
			ultimo.setProximo(novo);
			ultimo = novo;
		}
		
	}
    
    public void RemoverComeco() {
    	
    	if(primeiro == null) {
    		
    		System.out.println("Deque vazio");
    		
    	} else {
    		
    		No aux = primeiro;
    		
    		primeiro = primeiro.getProximo();
    		
    		aux = null;
    	}
    }
    
    public void RemoverFim() {
    	
    	No aux = primeiro;
    	No anterior = null;
    	
    	if(primeiro == null) {
    		
    		System.out.println("Deque vazio");

    	} else {

    		if(primeiro == ultimo) {

    			primeiro =null;

    		} else {

    			while(aux.getProximo() != null) {

    				anterior = aux;
    				aux = aux.getProximo();

    			}

    			anterior.setProximo(null);

    			ultimo = anterior;

    			aux = null;
    		}
    	}
    }
    
    public void exibir() {
    	
    	No aux = primeiro;
    	
    	while(aux != null) {
    		
    		System.out.print(aux.getNumero() + " ");
    		aux = aux.getProximo();
    	}
    }
}
