public class LDE {
	Node head;//cabeça da lista
	Node tail;//cauda da lista, nenhum dos dois guarda info
	LDE(){
		 head = new Node();
		 tail = new Node();
		 //AQUI A LISTA ESTA VAZIA
		// head.prev = null;//nao tem nada antes da cabeça
		// tail.next = null;//depois da cauda nao tem nada antes da cauda
		 head.next = tail;//o que vem depois da cabeça é a cauda
		 tail.prev = head;//o que vem antes da cauda é a cabeça
	}
	
	void print() {
		Node aux = head;
		while(aux.next != tail) {
			aux = aux.next;
			System.out.println(aux.info);
		}
	}
	void inserirInicio(int valor) {
		Node novo = new Node();
		novo.info = valor;
		novo.next = head.next;
		novo.prev = head;
		head.next = novo;
		novo.next.prev = novo;//antes do nó que vem depois do novo, vem novo  
	}
	
	void inserirPos(int valor, int pos) {
		Node novo = new Node();
		novo.info = valor;
		novo.next = null;
		Node aux = head;
		
		for(int i = 1; i < pos; i++) {
			aux = aux.next;
		}
		novo.next = aux.next;
		aux.next = novo;
		novo.prev = aux;
		novo.next.prev = novo;
		
		
	}
	void inserirFinal(int valor) {
		 Node novo = new Node();
		 novo.info = valor;
		 novo.next = tail;
		 novo.prev = tail.prev;
		 tail.prev.next = novo;
		 tail.prev = novo;
	}
	
	public int buscarValor(int valor) {
		Node aux = new Node();
		aux = head;
		int pos = 0;
		while(aux != tail){
			if(aux.info == valor) {
				return pos;
			}
			pos++;
			aux = aux.next;
		}
		return -1;
	}
	
	int removerInicio() {
		int v = head.next.info;
		head.next = head.next.next;
		head.next.prev = head;
		return v;
	}
	
	int  removerFinal() {
		/*Node aux = head;
		while(aux.next.next != tail) {
			aux = aux.next;
		}
		aux.next = tail;*/
		int v = tail.prev.info;
		tail.prev = tail.prev.next;
		tail.prev.next = tail;
		return v;
	}
	
	void removerPos(int pos) {
		Node aux = head.next;
		for(int i = 1; i < pos -1; i++) {
			aux = aux.next;
		}
		aux.next = aux.next.next;
		aux.next.prev = aux;
	}

	boolean isEmpty() {
		if(head.next == tail) return true;
		return false;
	}
}