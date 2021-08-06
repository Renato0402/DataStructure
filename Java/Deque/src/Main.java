import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int escolha;
		
		Deque d = new Deque();
		
		
		do {
			
			System.out.println("\n1.Adicionar no comeco");
			System.out.println("2.Remover no comeco");
			System.out.println("3.Adicionar no fim");
			System.out.println("4.Remover no fim");
			System.out.println("5.Exibir deque");
			
			 escolha = teclado.nextInt();
			
			
			if(escolha == 1) {
				
				System.out.println("Digite um numero para adicionar no comeco do deque");
				
				int numero = teclado.nextInt();
				
				d.addComeco(numero);
				
			}
			
			
			if(escolha == 2) {
				
				
				d.RemoverComeco();
				
			}
			
			
			if(escolha == 3) {
				
				System.out.println("Digite um numero para adicionar no final do deque");
				
				int numero = teclado.nextInt();
				
				d.addFim(numero);
				
			}
			
			
			if(escolha == 4) {
				
				
				
				d.RemoverFim();;
				
			}
			

			if(escolha == 5) {
				
				
				
				d.exibir();
				
			}
			
			
			
			if(escolha < 1 || escolha > 5) {
				
				System.out.println("opção invalida");
			}
			
		}while(escolha != 6);
	}

}
