package ListadeExerciciosaula11;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = scanner.nextLine();
		int i = 1;

		while (i <= 10) {
			System.out.println(nome);
			i++;
		}
		scanner.close();
	}
}
