import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Lista pilha = new Lista();
		
		int escolha;
		
		do {
			
			System.out.println("1.Adicionar numero na pilha.");
			System.out.println("2.Consultar a pilha.");
			System.out.println("3.Remover numero da pilha.");
			System.out.println("4.Esvaziar a pilha.");
			System.out.println("5.Sair");
			
			 escolha = teclado.nextInt();
			 
			 if(escolha == 1) {
				 
				 System.out.println("Digite um  numero para adicionar na pilha");
				 
				 int numero = teclado.nextInt();
				 
				 pilha.adicionar(numero);
			 }
			 
			 
			 if(escolha == 2) {
				 
				 pilha.exibir();
			 }
			 
			 if(escolha == 3) {
				 
				 pilha.remover();
			 }
			 
			 if(escolha == 4) {
				 
				 pilha.esvaziar();
			 }
			 
			 if(escolha == 5) {
				 
				 System.out.println("Voce saiu do programa");
				 break;
			 }
			
			
		}while(escolha!=5);
	}

}
