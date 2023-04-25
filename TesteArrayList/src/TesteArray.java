import java.util.ArrayList;
import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList();

		for (int i = 1; i <= 20; i++) {
			obj.add(i);
			
		}
		


		System.out.println(obj);
		System.out.println(obj.get(19));

	}
}
