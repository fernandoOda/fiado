package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Informe o nome do Cliente: ");
			String nome = scanner.nextLine();

			System.out.print("Informe o telefone do Cliente: ");
			int telefone = Integer.valueOf(scanner.nextLine());

			Consumidor consumidor = new Consumidor(nome, telefone);

			System.out.print("Informe o valor da compra: ");
			int fiado = Integer.valueOf(scanner.nextLine());
			consumidor.registrarFiado(fiado);

			int total = consumidor.getFiado();

			if (total > 100) {
				System.out.println("Cliente: " + consumidor.getNome() + " - Telefone " + consumidor.getTelefone()
						+ " - Deve: " + total + " - Ganhou brinde!");
			} else {

				System.out.println("Cliente: " + consumidor.getNome() + " - Telefone: " + consumidor.getTelefone()
						+ " - Deve: " + total);
			}

		}
	}
}