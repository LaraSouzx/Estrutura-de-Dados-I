
public class Principal {

	public Principal() {
		
	LDE lista = new LDE();
		lista.inserirInicio(67);
		lista.inserirFinal(14);
		lista.inserirFinal(19);
		lista.inserirFinal(22);
		lista.inserirFinal(15);
		lista.inserirPos(33, 2);
		//lista.removerInicio();
		//lista.removerFinal();
		lista.removerPos(3);
		lista.print();
	    int buscarValor = lista.buscarValor(33);
		System.out.println("esta na posicao: "+buscarValor);
		LSE lista = new LSE();
		lista.inserirInicio(22);
		lista.inserirFinal(14);
		lista.inserirFinal(12);
		lista.inserirFinal(19);
		lista.inserirFinal(21);
		lista.inserirFinal(15);
		//lista.inserirPos(33, 2);
		//lista.removerInicio();
		//lista.removerFinal();
		lista.removerPos(3);
		lista.print();
		//int pos = lista.buscar(19);
		//System.out.println("O valor buscado esta na posicao: "+pos);
		
		//TREINO PARA ATIVIDADE2
		// 1) um metodo que receba duas LDEs, L1 e L2, onde L1 tem elementos e 
		//L2 esta vazia e mova todos os elementods de L1 para L2 para ordem inversa
		LDE l1 = new LDE();
		LDE l2 = new LDE();
		
		l1.inserirInicio(15);
		l1.inserirInicio(17);
		l1.inserirInicio(16);
		l1.inserirInicio(19);
		
		l2.inserirInicio(22);
		l2.inserirInicio(90);
		l2.inserirInicio(12);
		l2.inserirInicio(27);
		this.alternarLista(l1, l2);
		//this.moverLista(l1, l2);
		// 2)um metodo que receba tres LDEs L1, L2, L3, onde apenas L1 e L2 tem elementos e construa a L3 com valores alternados de L1 e  L2
		// L1: 15 - 17 - 16
		// L2: 21 - 14 - 12
		
		LDE l1 = new LDE();
		l1.inserirInicio(12);
		l1.inserirInicio(16);
		l1.inserirInicio(21);
		l1.inserirInicio(14);
		l1.inserirInicio(10);
		
		LDE l2 = new LDE();
		l2.inserirInicio(17);
		l2.inserirInicio(19);
		l2.inserirInicio(12);
		l2.inserirInicio(13);
		l2.inserirInicio(23);
		l1.inserirPos(16, 2);
		l1.print();
		this.compararLista(l1, l2);
	l1.print();
	System.out.println("-------------------------------------------------");
	l2.print();
		LDE l3 = new LDE();
		this.listaCrescente(l1, l2, l3);
		this.trocarLista(l1, l2, l3);
		boolean  resultado =this.verificaInversa(l1, l2);
		System.out.print(resultado);
		
	}
	/*
	 * na LSE CRIE OS METODOS
	 * 	- REMOVER TODOS OS VALORES PARES
	 * 	- DUPLICAR TODOS OS VALORES IMPARES
	 * 	- CALCULAR A MEDIA ENTRE OS VALORES DA LISTA
	 * 
	 * LDE NA CLASSE PRINCIPAL, IMPLEMENTAR UM METODO PARA:
	 * 	-  A PARTIR DE DUAS LISTAS L1 E L2 RECEBIDAS COMO ARGUMENTO CRIAR L3 COM A PRIM
	 * */
	public static void main(String[] args) {
		Principal app = new Principal();
	}
	
	// elaborar um algoritimo na classe principal para receber duas LDEs l1 e l2 
	//e comparar os valores de mesma posicao nas listas, deixando na l1 o menor e na l2 o maior dos dois valores 
	public void compararLista(LDE l1, LDE l2) {
		
		
		for(int i = 0; i <= 4; i++) {
			int x = l1.removerFinal();
			int y = l2.removerFinal();
			 if(x > y){
				 l2.inserirInicio(x);
				 l1.inserirInicio(y);
			 }else {
				 l1.inserirInicio(x);
				 l2.inserirInicio(y);
			 }
			
			
		}
		
		//l1.print();
		//System.out.println("-------------------------------------------------");
		//l2.print();
	}
	
	
	//um metodo que receba duas LDEs l1 e l2, e retorne true se uma for a inversa da outra e false
	//caso contrario
	
	public boolean verificaInversa(LDE l1, LDE l2) {
		boolean resultado = false;
		while(!l1.isEmpty() && !l2.isEmpty()) {
			int x = l1.removerInicio();
			int y = l2.removerFinal();
			if(x == y) {
				resultado = true;
			}else {
				resultado = false;
			}
		}
		return resultado;
	}
	
	// um metodo que receba tres LDEs, L1, L2, L3, onde apenas L1 tem elemento
	// e construa a L2 com os valores pares de L1 e a lista L3 com os valores impares de L1
	
	public void trocarLista(LDE l1, LDE l2, LDE l3) {
		int x;
		while(!l1.isEmpty()) {
			if(l1.head.next.info % 2 == 0) {
				x = l1.removerInicio();
				l2.inserirInicio(x);
			}else {
				x = l1.removerInicio();
				l3.inserirInicio(x);
			}
		}
		l2.print();
		System.out.println("-------------------------------------------------");
		l3.print();
	}
	
	// um metodo que receba 3 LDEs L1, L2, L3, onde apenas l1 e l2 tem elementos e construa a 
	//l3 com os valores de l1 e l2 em ordem crescente. suponha que l1 e l2 estao ordenadas, mas podem ter tamanho distinto
	public void listaCrescente(LDE l1, LDE l2, LDE l3) {
		int x;
		while(!l1.isEmpty() && !l2.isEmpty()) {
			
			if(l1.head.next.info > l2.head.next.info) {
				 x = l2.removerInicio();
				l3.inserirInicio(x);
			}else {
				x = l2.removerInicio();
				l3.inserirInicio(x);
			}
			
			if(l1.head.next.info < l2.head.next.info) {
				 x = l1.removerInicio();
				l3.inserirInicio(x);
			}else {
				x = l1.removerInicio();
				l3.inserirInicio(x);
			}
			
		}
		l3.print();
	}
	
	
	public void moverLista(LDE l1, LDE l2) {
		while(!l1.isEmpty()) {
			int valor = l1.removerInicio();
			l2.inserirInicio(valor);
		}
		l2.print();
		
	}
	
	public void alternarLista(LDE l1, LDE l2) {
		LDE l3 = new LDE();
		while(!l1.isEmpty() && !l2.isEmpty()) {
			int  x = l1.removerInicio();
			l3.inserirInicio(x);
			int y = l2.removerInicio();
			l3.inserirInicio(y);
		}
		l3.print();
	}
}
