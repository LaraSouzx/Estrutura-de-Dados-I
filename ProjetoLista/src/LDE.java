public class LDE {
 Node head;
 Node tail;
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
	    while (aux != tail.prev) {
	        aux = aux.next;
	        System.out.println(aux.info);
	    }
	    
 }
 
 void inserirInicio(int valor) {
	 Node novo = new Node();
     novo.info = valor;
     novo.next = head.next;
     novo.prev = head;
     head.next.prev = novo;
     head.next = novo;
	
 }
 void inserirFinal(int valor) {
	 Node novo = new Node();
	 novo.info = valor;
	 novo.next = tail;
	 novo.prev = tail.prev;
	 tail.prev.next = novo;
	 tail.prev = novo;
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
}
