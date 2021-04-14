package defi1;
import java.util.Scanner;
public class defi5 {
	public static void main(String[] args) {
		Scanner Scnum1 = new Scanner(System.in);
		System.out.println("Entre un nombre :");
		String num1 = Scnum1.nextLine();

		System.out.println("Entre un autre nombre :");
		Scanner Scnum2 = new Scanner(System.in);
		String num2 = Scnum2.nextLine();

		System.out.println("Entre un autre nombre :");
		Scanner Scnum3 = new Scanner(System.in);
		String num3 = Scnum3.nextLine();

		System.out.println("Entre un autre nombre :");
		Scanner Scnum4 = new Scanner(System.in);
		String num4 = Scnum4.nextLine();

		System.out.println("Entre un autre nombre :");
		Scanner Scnum5 = new Scanner(System.in);
		String num5 = Scnum5.nextLine();

		int moyene = (Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3) + Integer.parseInt(num4) + Integer.parseInt(num5)) / 5;
		System.out.println("moyene: " + moyene);
		Scnum1.close();
		Scnum2.close();
		Scnum3.close();
		Scnum4.close();
		Scnum5.close();
	}
}
