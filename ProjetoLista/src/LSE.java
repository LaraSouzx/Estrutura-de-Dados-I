public class LSE {
	//Cabeça (início) da lista: referencia o primeiro node 
	Node head;
	
	
	//Método construtor: chamado no momento da criação (new) do objeto
	LSE() {
		head = new Node();
		head.next = null;
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
		
		for(int i = 0; i < pos; i++) {
			aux = aux.next;
			
		}
		novo.next = aux.next;
		aux.next = novo;
		
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
	
	
	 public int buscarValor(int valor) {
		Node aux = new Node();
		aux = head;
		int pos = 0;
		while(aux!= null) {
			if(aux.info == valor) {
				return pos;
			}
			pos++;
			aux = aux.next;
		}
		return -1;
	}
	
	void removerInicio() {
		/*if(head == null) {
			return;
		}
		head = head.next;*/
	}
	
	void removerFinal() {
		
	}
	
	void removerPos(int pos) {
		
	}
	boolean isEmpty() {
		if(head.next == null) return true;
		return false;
	}
}