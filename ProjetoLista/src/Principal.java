
public class Principal {

	public Principal() {
		LSE lista = new LSE();
		lista.inserirInicio(22);
		lista.inserirFinal(14);
		lista.inserirFinal(12);
		lista.inserirFinal(19);
		lista.inserirFinal(21);
		lista.inserirFinal(15);
		lista.inserirPos(33,2);
		int posicao = lista.buscarValor(14);
		System.out.println(posicao);
		
		//lista.print();
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
