package tarefa.wrapper;

public class Wrappers {

	public static void main(String[] args) {
		
		int inteiro = 99;
		System.out.println("Variável primitiva = " + inteiro);
		
		Integer intWrap = Integer.valueOf(inteiro);
		System.out.println("Variável wrapper = " + intWrap);
		
		float inteiro2 = inteiro;
		System.out.println("Casting = " + inteiro2);

	}

}
