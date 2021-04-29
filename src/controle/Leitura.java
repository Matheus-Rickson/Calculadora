package controle;

import java.util.Scanner;
@SuppressWarnings("resource")
public abstract class Leitura {

	private Leitura() {
	}

	public static String lerStr() {
		
		Scanner ler = new Scanner(System.in);

		return ler.nextLine();
	}

	public static int lerInt() {
		Scanner ler = new Scanner(System.in);

		return ler.nextInt();
	}
	public static float lerFloat() {
		Scanner ler = new Scanner(System.in);

		return ler.nextFloat();
	}
	
	public static double lerdouble() {
		Scanner ler = new Scanner(System.in);

		return ler.nextDouble();
		
	}

}

// Essa classe evita os buffers que por ventura s�o gerados pelo teclado.