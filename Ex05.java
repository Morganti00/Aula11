package ListadeExerciciosaula11;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somador = 0, num;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe um número:");
			num = ler.nextInt();
			somador = somador + num;
		}
		System.out.println("A soma destes elementos é: " + somador);
	}
}