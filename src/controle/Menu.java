package controle;

import java.text.DecimalFormat;

public class Menu {

	Calculadora cl;

	public Menu() {

		cl = new Calculadora();

	}

	public void executar() {

		int opcao;

		do {

			System.out.println("------------Menu------------");
			System.out.println("- 1 - Opera��es b�sicas    -");
			System.out.println("- 2 - Tabuada              -");
			System.out.println("- 3 - Juros Composto       -");
			System.out.println("- 4 - Conversores          -");
			System.out.println("- 0 - Sair                 -");
			System.out.println("----------------------------");

			opcao = Leitura.lerInt();

			switch (opcao) {
			case 1:
				operacoesBasicas();
				break;
			case 2:
				cl.tabuada();
				break;
			case 3:
				printFormatado("O resultado foi: ", cl.jurosComposto());
				break;
			case 4:
				conversores();
				break;
			case 0:
				return;
			default:
				System.out.println("Op��o inv�lida");

			}
			System.out.println("\n\n\n\n");
		} while (opcao != 0);
	}

	// INICIO DO BLOCO DE OPERA��ES B�SICAS
	public void operacoesBasicas() {
		int userDoUser = 0;

		do {
			System.out.println("------Opera��esB�sicas------");
			System.out.println("- 1 - Adi��o               -");
			System.out.println("- 2 - Subtra��o            -");
			System.out.println("- 3 - Multiplica��o        -");
			System.out.println("- 4 - Divis�o              -");
			System.out.println("- 0 - Voltar               -");
			System.out.println("----------------------------");
			userDoUser = Leitura.lerInt();

			switch (userDoUser) {
			case 1:
				System.out.println(cl.adicao());

				break;
			case 2:
				System.out.println(cl.subtracao());
				break;
			case 3:
				System.out.println(cl.multiplicacao());
				break;

			case 4:
				System.out.println(cl.divisao());
				break;

			case 0:
				return;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}

		} while (userDoUser != 0);
	}

	// FIM DO BLOCO DE OPERA��ES B�SICAS

	public void conversores() {
		int conversor = 0;

		do {

			System.out.println("------Opera��esB�sicas------");
			System.out.println("- 1 -Mi para Km            -");
			System.out.println("- 2 - Km para Mi           -");
			System.out.println("- 0 - Voltar               -");
			System.out.println("----------------------------");
			conversor = Leitura.lerInt();

			switch (conversor) {
			case 1:
				printFormatado("A velocidade em KM �: ", cl.milhasPraQuilometros());
				break;
			case 2:
				printFormatado("A velocidade em MI �: ", cl.quilometrosPraMilhas());
				break;
			default:
				System.out.println("Op��o inv�lida");

				break;
			}

		} while (conversor != 0);

	}

	private void printFormatado(String texto, double numero) {

		DecimalFormat formatador = new DecimalFormat("#.##");
		System.out.println(texto + formatador.format(numero));

	}
}
