
public class Arvore {

	private No raiz;

	public Arvore() {

		raiz = null;

	}

	public void adicionar(No n, int valor) {

		No novo = new No(valor);

		if(n.getValor() == valor) {

			System.out.println("Numero repetido");

		} else if(valor < n.getValor()) {

			if(n.getEsquerda() == null) {

				n.setEsquerda(novo);

			} else {

				adicionar(n.getEsquerda(),valor);

			}

		} else if(valor > n.getValor()) {

			if(n.getDireita() == null) {

				n.setDireita(novo);

			} else {

				adicionar(n.getDireita(),valor);
			}
		}
	}

	public void adicionar(int valor) {

		No novo = new No(valor);


		if(raiz == null) {

			raiz = novo;

		} else {

			adicionar(raiz,valor);
		}
	}

	public boolean remover(int valor) {

		if(raiz == null) {

			return false;

		} else {

			if(raiz.getValor() == valor) {

				No aux = new No(0);
				aux.setEsquerda(raiz);
				boolean result = raiz.remover(aux, valor);
				raiz = aux.getEsquerda();
				return result;

			} else {

				return raiz.remover(null, valor);
			}
		}
	}

	public boolean buscar(No n, int valor) {

		if(n.getValor() == valor) {

			return true;

		} else if(valor < n.getValor()) {

			if(n.getEsquerda() == null) {

				return false;

			} else {

				return buscar(n.getEsquerda(),valor);

			}

		} else if(valor > n.getValor()) {

			if(n.getDireita() == null) {

				return false;

			} else {

				return buscar(n.getDireita(),valor);
			}
		}

		return true;
	}

	public void buscar(int valor) {

		if(raiz == null) {

			System.out.println("Arvore vazia");

		} else {

			if(buscar(raiz,valor) == true) {

				System.out.println("Numero na arvore: " + valor);

			} else {

				System.out.println("Numero " + valor +" não encontrado na arvore");
			}
		}
	}

	public void PreOrdem(No n) {

		System.out.print(n.getValor() + " ");

		if(n.getEsquerda() != null) {

			PreOrdem(n.getEsquerda());
		}

		if(n.getDireita() != null) {

			PreOrdem(n.getDireita());
		}
	}

	public void EmOrdem(No n) {



		if(n.getEsquerda() != null) {

			EmOrdem(n.getEsquerda());
		}

		System.out.print(n.getValor() + " ");

		if(n.getDireita() != null) {

			EmOrdem(n.getDireita());
		}
	}

	public void PosOrdem(No n) {



		if(n.getEsquerda() != null) {

			PosOrdem(n.getEsquerda());
		}

		if(n.getDireita() != null) {

			PosOrdem(n.getDireita());
		}

		System.out.print(n.getValor() + " ");
	}

	public void PreOrdem() {

		PreOrdem(raiz);
	}

	public void EmOrdem() {

		EmOrdem(raiz);
	}

	public void PosOrdem() {

		PosOrdem(raiz);
	}
}
