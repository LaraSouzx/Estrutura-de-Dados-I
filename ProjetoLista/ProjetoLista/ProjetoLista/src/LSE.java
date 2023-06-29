public class LSE {
	//Cabeça (início) da lista: referencia o primeiro node 
	Node head;
	
	
	//Método construtor: chamado no momento da criação (new) do objeto
	LSE() {
		head = new Node();
		head.next = null;
	}
	
	void removerInicio() {
		head.next = head.next.next;
	}
	
	void removerFinal() {
		Node aux = head;
		while(aux.next.next != null) {
			aux = aux.next;
		}
		aux.next = null;
		
	}
	void print() {
		Node aux = head;
		while(aux.next != null) {
			aux = aux.next;
			System.out.println(aux.info);
		}
	}
	
	void inserirInicio(int valor) {
		Node novo = new Node();
		novo.info = valor;
		novo.next = head.next;
		head.next = novo;
	}
	
	void inserirPos(int valor, int pos) {
		Node novo = new Node();
		novo.info = valor;
		novo.next = null;
		Node aux = head;
		
		for(int i = 0; i <= pos; i++) {
			aux = aux.next;
		}
		novo.next = aux.next;
		aux.next = novo;
	
	}
	
	public int buscar(int valor) {
		Node aux = new Node();
		aux = head;
		int pos = 0;
		while(aux != null){
			if(aux.info == valor) {
				return pos;
			}
			pos++;
			aux = aux.next;
		}
		return -1;
	}
	void inserirFinal(int valor) {
		Node novo = new Node();
		novo.info = valor;
		novo.next = null;

		//Referência auxiliar para percorrer a lista
		Node aux = head;
		
		//Percorre a lista procurando o último node.
		//Enquanto o aux não for o último, avanço na lista
		while(aux.next != null) {
			aux = aux.next;
		}
		
		aux.next = novo;
	}
	void removerPos(int pos) {
		Node aux = new Node();
		aux = head.next;
		for(int i = 1; i < pos -1; i++) {
			aux = aux.next;
		}
		aux.next = aux.next.next;
	}
	
	/*void removerPar() {
		Node aux = new Node();
		aux = head.next;
		while(aux.next != null) {
			aux = aux.
			if()
		}
	}*/
	
	
	boolean isEmpty() {
		if(head.next == null) return true;
		return false;
	}
}