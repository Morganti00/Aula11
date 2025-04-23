package ListadeExerciciosaula11;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 1;

		while (i <= 20) {

			System.out.println("Usuário informe a sua idade:");
			int idade = scanner.nextInt();
			i++;
		}
		scanner.close();

	}
}
