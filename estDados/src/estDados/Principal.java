package estDados;
public class Principal {

	public Principal() {

		// Tipo objeto

		Pilha pilha = new Pilha();
		Pilha p1 = new Pilha();
		Pilha p2 = new Pilha();
		pilha.push(15);

		pilha.push(12);

		pilha.push(25);
		
		printPilha(pilha);
		
		printPilhaInvertida(pilha);
		
		buscarPilha(pilha, 15);
		
		Pilha pPar = pilhaPar(p1);
		printPilha(pPar);
		
		boolean resultado = compararPilha(p1, p2);
		System.out.println(resultado);
		verificarElemento(p1, p2);
		Pilha p3 = fusaoPilha(p1, p2);
		printPilha(p3);
		
		Fila fila = new Fila();
		Fila f1 = new Fila();
		Fila f2 = new Fila();
		fila.enqueue(12);
		fila.enqueue(17);
		fila.enqueue(19);
		fila.enqueue(23);
		fila.enqueue(25);
		
		f1.enqueue(15);
		f1.enqueue(19);
		f1.enqueue(21);
		f1.enqueue(22);
		
		f2.enqueue(21);
		f2.enqueue(32);
		f2.enqueue(18);
		f2.enqueue(34);

		printFila(fila);
		buscarFila(fila, 17);
		inverterFila(fila);
		Fila f3 = new Fila();
		f3 = interpolarFilas(f1, f2);
		printFila(f3);
		
	}
	
	void misturarFila(Fila f1) {
		int x, y;
		int tam = f1.size();
		for(int i = 0; i< tam/2; i++) {
			x = f1.dequeue();
			y = f1.dequeue();
			f1.enqueue(y);
			f1.enqueue(x);
			System.out.print(y+" - " + x+" - ");
		}
	}
	void misturarPilha(Pilha p1, Pilha p2, Pilha p3) {
		Pilha pAux = new Pilha();
		p3.push(16);
		p3.push(17);
		p3.push(18);
		p3.push(19);
		while(p1.isEmpty() == false) {
			int i, tam1;
			i = p1.pop();
			pAux.push(i);
			if(i % 2 == 0) {
				p2.push(i);
			}else{
				p2.push(i);
			}
		}
		while(p3.isEmpty()==false) {
			int y;
			y = p3.pop();
			pAux.push(y);
			if(y % 2 == 0) {
				p2.push(y);
				System.out.println("misturou a pilha");
			}
		}
	}
	void removerValor(Fila fila, int valor) {
		Fila filaAux = new Fila();
		int valorAux;
		while(fila.isEmpty()==false) {
			valorAux = fila.dequeue();
			if(valor != valorAux) {
				filaAux.enqueue(valorAux);
			}
		}
		while(fila.isEmpty() == false) {
			valorAux = filaAux.dequeue();
			fila.enqueue(valorAux);
		}
	}
	public Fila interpolarFilas(Fila f1, Fila f2) {
		Fila f3 = new Fila();
		int tam1 = f1.size();
		int tam2 = f2.size();
		for(int i = 0; i < tam1; i++) {
			int x = f1.dequeue();
			f3.enqueue(x);
			int y = f2.dequeue();
			f3.enqueue(y);
		}
		return f3;
	}
	
	public void inverterFila(Fila fila) {
		Pilha pAux = new Pilha();
		int x = fila.size();
		for(int i = 0; i < x; i++) {
			x = fila.dequeue();
			pAux.push(x);
		}
		
		while(pAux.isEmpty()==false){
			int y = pAux.pop();
			fila.enqueue(y);
		}
	}
	void printFila(Fila fila) {

		//desinfileira, imprime, enfileira de volta

		for(int i = 0; i < fila.size(); i++) {

		int x = fila.dequeue();

		System.out.println(x);

		fila.enqueue(x);

		}

		System.out.println("--------------------");

		}
	
	
	boolean buscarFila(Fila fila, int valor){
		//verifica se determinado valor existe na fila, retorna true ou false
		boolean resultado = false;
		for(int i = 0; i < fila.size(); i++) {
			int x = fila.dequeue();
			fila.enqueue(x);
			if(x == valor) {
				resultado = true;
			}else {
				resultado = false;
			}
		}
			return resultado;
	}
	
	Pilha pilhaPar(Pilha p1){
		//verifica se há numeros pares na pilha
		//caso tenha será retornado em uma nova pilha somente
		//os elementos pares.

		Pilha p2 = new Pilha();

		Pilha p1Aux = new Pilha();

		while(p1.isEmpty()==false){

		int x = p1.pop();

		p1Aux.push(x);

		if(x%2 == 0){

		p2.push(x);

		}

		}

		while(p1Aux.isEmpty() == false) {

		int v1Aux = p1Aux.pop();

		p1.push(v1Aux);

		}

		return p2;

		}
	
	
	int verificarElemento(Pilha p1, Pilha p2) {
		//verifica se na em duas pilhas ha elementos iguais
		//caso tenha, é retornado a quantidade elementos iguais
		Pilha p1Aux = new Pilha();

		Pilha p2Aux = new Pilha();

		int i=0, x, y;

		while(p1.isEmpty()==false && p2.isEmpty()==false) {

			x = p1.pop();

			y = p2.pop();

			p1Aux.push(x);

			p2Aux.push(y);

			if(x == y){
				i++;
			}
		}

		while(p1Aux.isEmpty() == false) {

			int v1Aux = p1Aux.pop();

			p1.push(v1Aux);

		}

		while(p2Aux.isEmpty() == false) {

			int v2Aux = p2Aux.pop();

			p2.push(v2Aux);

		}

			return i;

		}
	
	
	boolean compararPilha(Pilha p1, Pilha p2){
			//verifica se duas pilhas sao iguais
		boolean iguais = false;


		Pilha p1Aux = new Pilha();

		Pilha p2Aux = new Pilha();

		while(p1.isEmpty() == false && p2.top() == p1.top()) {

			int x = p1.pop();

			int y = p2.pop();

			p1Aux.push(x);

			p2Aux.push(y);

		}


		if(p1.isEmpty() == true && p2.isEmpty() == true) {

			iguais = true;

		}else {

			iguais = false;

		}


		while(p1Aux.isEmpty() == false) {

			int v1Aux = p1Aux.pop();

			p1.push(v1Aux);

		}

		while(p2Aux.isEmpty() == false) {

			int v2Aux = p2Aux.pop();

			p2.push(v2Aux);

		}

			return iguais;

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


public static void main(String[] args) {

Principal app = new Principal();

}

}