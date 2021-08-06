import java.util.ArrayList;

public class Main {

	public static void main(String [] args) {
		
		Arvore arvore = new Arvore();
		
		arvore.adicionar(6);
		arvore.adicionar(2);
		arvore.adicionar(1);
		arvore.adicionar(4);
		arvore.adicionar(3);
		arvore.adicionar(5);
		arvore.adicionar(8);
		arvore.adicionar(7);
		arvore.adicionar(9);
		arvore.adicionar(0);
		
		for(int i = 0; i < 12; i ++) {
			
			arvore.buscar(i);
		}
	
		arvore.buscar(12);
		
		System.out.println("Antes da remoção");
		
		arvore.PreOrdem();
		System.out.println("");
		arvore.EmOrdem();
		System.out.println("");
		arvore.PosOrdem();
		System.out.println("");
		
		for(int i = 0; i < 4;i++)
		
		arvore.remover(i);
		
		System.out.println("Apos remoção");
	
		arvore.PreOrdem();
		System.out.println("");
		arvore.EmOrdem();
		System.out.println("");
		arvore.PosOrdem();
		System.out.println("");
		
		
	}
}
