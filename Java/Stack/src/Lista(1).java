
public class Lista {

	Pilha topo;
	
	public Lista() {
		
		topo = null;
	}
	
	public void adicionar(int numero) {
		
		Pilha novo = new Pilha(numero);
		
		novo.setProximo(topo);
		topo = novo;
		
		System.out.println("Numero inserido na pilha");
	}
	
	public void exibir() {
		
		if(topo == null) {
			
			System.out.println("Pilha esta vazia");
			
		} else {
		
		Pilha aux = topo;
		
		while(aux != null) {
			
			System.out.println(aux.getNumero());
			aux = aux.getProximo();
		}
	}
  }
	
	public void remover() {
		

		
		if(topo == null) {
			
			System.out.println("Pilha esta vazia");
		} else {
			
			System.out.println("Numero " + topo.getNumero()  + " removido com sucesso");
			
			topo = topo.getProximo();
		}
	}
	
	public void esvaziar() {
		
		if(topo == null) {
			
			System.out.println("Lista esta vazia");
			
		} else {
			
			topo = null;
			System.out.println("A pilha foi esvaziada.s");
		}
	}
}
