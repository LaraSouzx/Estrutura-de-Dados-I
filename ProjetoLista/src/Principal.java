
public class Principal {

	public Principal() {
		LDE lista = new LDE();
		lista.inserirInicio(33);
		lista.inserirFinal(12);
		lista.inserirFinal(15);
		lista.inserirFinal(52);
		lista.inserirFinal(19);
		lista.inserirFinal(18);
		lista.inserirPos(92, 3);
		lista.print();
		
		/*LSE lista = new LSE();
		lista.inserirInicio(22);
		lista.inserirFinal(14);
		lista.inserirFinal(12);
		lista.inserirFinal(19);
		lista.inserirFinal(21);
		lista.inserirFinal(15);
		lista.inserirPos(33, 2);
		//lista.removerInicio();
		//lista.removerFinal();
		//lista.removerPos(3);
		int posicao = lista.buscarValor(14);
		lista.print();
		System.out.println("O valor procurado esta na posicao "+posicao);*/
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
