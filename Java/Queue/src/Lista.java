
public class Lista {

	Fila primeiro;
	Fila ultimo;
	
	public Lista() {
		
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void adicionar(int numero) {
		
		Fila novo = new Fila(numero);
		
		if(primeiro == null) {
			
			primeiro= novo;
			ultimo = novo;
			
		} else {
			
			ultimo.setProximo(novo);
			ultimo = novo;
		}
		
		System.out.println("\nNumero Adicionado na fila\n");
	}
	
	public void exibir() {
		
		if(primeiro == null) {
			
			System.out.println("Fila esta vazia.");
			
		} else {
			
			Fila aux = primeiro;
			
			while(aux!= null){
				
				System.out.print(aux.getNumero() + " ");
				aux = aux.getProximo();
			}
		}
	}
	
	public void remover() {
		
		if(primeiro == null) {
			
			System.out.println("Fila esta vazia.");
			
		} else {
			
			primeiro = primeiro.getProximo();
		}
	}
	
	public void esvaziar() {
		
		if(primeiro == null) {
			
			System.out.println("Lista esta vazia");
			
		} else {
			
			primeiro = null;
			System.out.println("Lista foi esvaziada");
		}
	}
}
