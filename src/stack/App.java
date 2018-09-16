package stack;

import java.util.Stack;


public class App {

	//Algoritmo lifo (El ultimo en entrar es el primero en salir)
	public static void main(String[] args) {
	
//		Stack<String> pila = new Stack<>();
//		pila.push("1----Sebastian");
//		pila.push("2----Juan");
//		pila.push("3----Agustin");
//		pila.push("4----Fernando");
//		pila.push("5----Javier");
//		pila.push("6----Hernan");
//
//		
//		for (String elemento : pila) {
//			System.out.println(elemento);
//		}
//		
//		System.out.println("\n");
//		
//		//Elemento que esta en el tope de la pila
//		System.out.println("Elemento que esta en el tope de la pila= "+pila.peek()+"\n");
//		
//		//Buscar un elemento de la pila
//				System.out.println("Posicion del elemento 1----Sebastian = "+pila.search("1----Sebastian")+"\n");
//		
//		while (!pila.isEmpty()) {
//			//Elimina hasta que no queden mas elementos
//			System.out.println("Eliminando a "+pila.pop());
//		}
		
		
		Stack<Persona> pila = new Stack<>();
		pila.push(new Persona(1,"Sebastian",66));
		pila.push(new Persona(2,"Juan",33));
		pila.push(new Persona(3,"Ramon",22));
		pila.push(new Persona(4,"Felipe",77));
		pila.push(new Persona(5,"Adrian",88));
		pila.push(new Persona(6,"Lucia",99));
		
		for (Persona elemento : pila) {
			System.out.println(elemento);
		}
		
		
		//Elemento que esta en el tope de la pila
		System.out.println("Elemento que esta en el tope de la pila= "+pila.peek()+"\n");
		
		//Buscar un elemento de la pila
		System.out.println("Posicion del elemento Sebastian = "+pila.search(new Persona(2,"Juan",33))+"\n");

		
		while (!pila.isEmpty()) {
		//Elimina hasta que no queden mas elementos
		System.out.println("Eliminando a "+pila.pop());
	}
		
	}

}
