package teste;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		int x;
		
		Scanner sc = new Scanner(System.in);
				x = sc.nextInt();
		System.out.println("seu numero divido por 2 é: " + x/2);
		
		sc.close();
	}

}
