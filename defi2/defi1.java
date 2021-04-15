package defi2;
import java.util.Scanner;

public class defi1 {
	public static void main(String[] args) {
		Scanner SCnum1 = new Scanner(System.in);
		System.out.println("Premier nombre :");
		String Snum1 = SCnum1.nextLine();
		int num1 = Integer.parseInt(Snum1);

		Scanner SCnum2 = new Scanner(System.in);
		System.out.println("Deuxieme nombre :");
		String Snum2 = SCnum2.nextLine();
		int num2 = Integer.parseInt(Snum2);

		if (num1 > num2) {
			System.out.println(num2);
		}
		else if (num1 < num2) {
			System.out.println(num1);
		}
		else if (num1 == num2) {
			System.out.println("il sont egale");
		}
		else {
			System.out.println("uhhhh");
		}
		SCnum1.close();
		SCnum2.close();
	}
}
