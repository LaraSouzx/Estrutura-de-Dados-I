package estDados;
public class Principal {

	public Principal() {

		// Tipo objeto

		Pilha pilha = new Pilha();

		pilha.push(15);

		pilha.push(12);

		pilha.push(25);

		printPilha(pilha);

		printPilhaInvertida(pilha);

		buscarPilha(pilha, 15);

		removerValor(pilha, 12);

	}

	void printPilha(Pilha pilha) {

	//System.out.println("??");
	
	//Obs 1: para acessar os valores da pilha desempilhamos quem está acima
	
	//Obs 2: ao desempilharmos um valor, nós PERDEMOS esse valor
	
	//Dica 1: ao desempilhar da pilha principal, guarde o valor em uma pilha auxiliar
	
	//Dica 2: desempilhar da pilha auxiliar de valor para a pilha original

	System.out.println("pilha");
	
	Pilha pAux = new Pilha();

	while(pilha.isEmpty() == false) {

		int vAux = pilha.pop();//tira somente o valor que esta no topo (ultimo) e guarda na variavel
		
		pAux.push(vAux); // a pilha auxiliar recebe esse valor
		
		System.out.println(vAux);//imprime os valores recebidos ate que a pilha original fique vazia
	}

	while(pAux.isEmpty() == false) {

		int vAux = pAux.pop();
		
		pilha.push(vAux);
		
		}
	}



	void printPilhaInvertida(Pilha pilha) {

		//Pilha pilha = new Pilha();
		
		Pilha pAux = new Pilha();
		
		System.out.println("pAux");
		
		while(pilha.isEmpty()==false) {
		
		int x = pilha.pop();
		
		pAux.push(x);
		
		System.out.println(x);
		}

	while(pAux.isEmpty() == false) {

		int vAux = pAux.pop();
		
		pilha.push(vAux);
		
		}
	}


	int buscarPilha(Pilha pilha, int valor) {

		//Verifica se determinado valor existe na pilha. Se existir, retorne a posição (índice)
		
		//do valor na pilha. Se não encontrar, retorne -1
		
		Pilha pAux = new Pilha();
		
		while(pilha.isEmpty() == false && valor != pilha.top()) {
		
		int x = pilha.pop();
		
		pAux.push(x);
	}

	if(pilha.top() == valor){
	
		System.out.println("O valor foi encontrado:");
		
		System.out.println(pilha.top());
	
	}else {
		System.out.println("O valor nao foi encontrado");
	}

	while(pilha.isEmpty()==false) {
		int x = pilha.pop();
		
		pAux.push(x);
		
	}

while(pAux.isEmpty() == false) {

int vAux = pAux.pop();

pilha.push(vAux);

}


return 0;

}


void removerValor(Pilha pilha, int valor) {

	Pilha pAux = new Pilha();

	while(pilha.isEmpty() == false && valor != pilha.top()) {

		int x = pilha.pop();

		pAux.push(x);
	}

	if(pilha.top() == valor){

		System.out.println("O valor foi removido");

		System.out.println(pilha.top());
		}
	while(pAux.isEmpty() == false) {
		int vAux = pAux.pop();
		pilha.push(vAux);
		}
}


void duplicarValor(Pilha pilha, int valor) {


}


void subistituirValor(Pilha pilha, int v1, int v2) {


}



public static void main(String[] args) {

Principal app = new Principal();

}

}