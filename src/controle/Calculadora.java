package controle;

public class Calculadora {

// start Container basic operations

	public double adicao() {

		double numero1, numero2;

		System.out.println("Digite o primeiro valor");
		numero1 = Leitura.lerdouble();
		System.out.println("Digite o primeiro valor");
		numero2 = Leitura.lerdouble();
		return numero1 + numero2;
	}

	public double subtracao() {

		double numero1, numero2;

		System.out.println("Digite o primeiro valor");
		numero1 = Leitura.lerdouble();
		System.out.println("Digite o primeiro valor");
		numero2 = Leitura.lerdouble();
		return numero1 - numero2;

	}

	public double multiplicacao() {

		double numero1, numero2;

		System.out.println("Digite o primeiro valor");
		numero1 = Leitura.lerdouble();
		System.out.println("Digite o primeiro valor");
		numero2 = Leitura.lerdouble();
		return numero1 * numero2;
	}

	public double divisao() {

		double numero1, numero2;

		System.out.println("Digite o primeiro valor");
		numero1 = Leitura.lerInt();
		System.out.println("Digite o primeiro valor");
		numero2 = Leitura.lerdouble();
		return numero1 / numero2;
	}

// end Container basic operations

	public void tabuada() {

		int numero, conta = 0;
		System.out.println("Informe o n�mero pra receber a tabuada: ");
		numero = Leitura.lerInt();

		System.out.println("--------------------------");
		for (int i = 1; i < 11; i++) {
			conta = numero * i;
			System.out.println(numero + " X " + i + " = " + conta);
		}
		System.out.println("--------------------------");
	}

	public double jurosComposto() {

		double capital, taxaJuros;
		int tempo;

		System.out.println("Digite o capital inicial: ");
		capital = Leitura.lerdouble();
		System.out.println("Digite a taxa de juros (%): ");
		taxaJuros = Leitura.lerdouble();
		System.out.println("Digite as parcelas: ");
		tempo = Leitura.lerInt();

		return capital * Math.pow(1 + taxaJuros, tempo);
	}

	public double milhasPraQuilometros() {

		double milhas, valorConversor = 0.62137;

		System.out.println("Digite o valor em milhas: ");
		milhas = Leitura.lerdouble();

		return milhas / valorConversor;
	}

	public double quilometrosPraMilhas() {

		double quilometros, valorConversor = 0.62137;

		System.out.println("Digite o valor em quilometros: ");
		quilometros = Leitura.lerdouble();

		return quilometros * valorConversor;
	}

}
