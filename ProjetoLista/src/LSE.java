public class LSE {
	//Cabeça (início) da lista: referencia o primeiro node 
	Node head;
	
	
	//Método construtor: chamado no momento da criação (new) do objeto
	LSE() {
		head = new Node();
		head.next = null;
	}
	
	void print() {
		Node aux = head;//cria um nó auxiliar
		while(aux.next != null) {//enquanto o próximo nó auxiliar não for nulo
			aux = aux.next;      //aux percorre a lista
			System.out.println(aux.info);
		}
		
	}
	
	void inserirInicio(int valor) {
		Node novo = new Node();    //cria um novo nó onde é inserido o valor
		novo.info = valor;         
		novo.next = head.next;    //o proximo nó depois do novo, recebe o proximo nó depois da cabeça
		head.next = novo;         //o proximo nó depois da cabeca recebe o novo
	}
	
	
	
	void inserirPos(int valor, int pos) {

		Node novo = new Node();
		novo.info = valor;
		novo.next = null;      //o proximo nó depois do novo é nulo
		
		Node aux = head;
		
		for(int i = 0; i < pos; i++) { //percorre a lista 
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
		head = head.next;
	}
	
	void removerFinal() {
		Node aux = head;
		while(aux.next.next != null) {
			aux = aux.next;
		}
		aux.next = null;
	}
	
	void removerPos(int pos) {
		Node aux = new Node();
		aux = head;
		Node remove = new Node();
		for(int i = 0; i < pos;  i++) {
			aux = aux.next;
		}
		remove = aux.next;
		aux.next = remove.next;
		 remove.next = null;
	}
	boolean isEmpty() {
		if(head.next == null) return true;
		return false;
	}
}