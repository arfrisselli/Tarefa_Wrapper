package tarefa.wrapper;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int inteiro = scan.nextInt();
		
		System.out.println("Variável primitiva = " + inteiro);

		Integer intWrap = Integer.valueOf(inteiro);
		System.out.println("Variável wrapper = " + intWrap);

		float inteiro2 = inteiro;
		System.out.println("Casting = " + inteiro2);

	}

}
