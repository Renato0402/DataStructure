import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
			Scanner teclado = new Scanner(System.in);
			
			Lista fila = new Lista();
			
			int escolha;
			
			do {
				
				System.out.println("\n1.Adicionar numero na fila.");
				System.out.println("2.Consultar a fila.");
				System.out.println("3.Remover numero da fila.");
				System.out.println("4.Esvaziar a fila.");
				System.out.println("5.Sair");
				
				 escolha = teclado.nextInt();
				 
				 if(escolha == 1) {
					 
					 System.out.println("Digite um  numero para adicionar na fila");
					 
					 int numero = teclado.nextInt();
					 
					 fila.adicionar(numero);
				 }
				 
				 
				 if(escolha == 2) {
					 
					fila.exibir();
				 }
				 
				 if(escolha == 3) {
					 
					 fila.remover();
				 }
				 
				 if(escolha == 4) {
					 
					 fila.esvaziar();
				 }
				 
				 if(escolha == 5) {
					 
					 System.out.println("Voce saiu do programa");
					 break;
				 }
				
				
			}while(escolha!=5);
		}

}
