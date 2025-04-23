package ListadeExerciciosaula11;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um nome:");
		String nome = scanner.nextLine();

		for (int i = 1; i <= 40; i++) {
			System.out.println(nome);
		}
		scanner.close();

	}

}
