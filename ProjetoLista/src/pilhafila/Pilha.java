package pilhafila;

public class Pilha {
		//atributos
		private int capacidade = 100;
		private int vetor [] = new int[100];
		private int i = 0;
		//metodos
		void push(int valor) {
			if(i < capacidade) {
				vetor[i++] = valor;
				
			}
		}
		
		int pop() {
			//se a pilha não estiver vazia 
			if(i > 0) {
				return vetor[--i];
			}else{//se a pilha estiver vazia
				return -1;
				}
			}
		 int size() {
		        return i;
		    }
		int top() {
			//se a pilha nn estiver vazia
			if(i>0) {
				return vetor[i -1];
			}else {
				return -1;
			}
		}
		int peek() {
			if (i > 0) {
	            return vetor[i - 1];
	        } else {
	            return -1;
	        }
		}
		
		boolean isEmpty() {//vazia = true, não vazia = false
			if(i == 0) {
				return true;
			}else {
				return false;
				}
			}
		}
		


