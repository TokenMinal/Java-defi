package defi1;
import java.util.Scanner;
public class defi3 {
	public static void main(String[] args) {
		Scanner Scnum1 = new Scanner(System.in);
		System.out.println("nombre 1:");
		String num1 = Scnum1.nextLine();

		System.out.println("nombre 2:");
		Scanner Scnum2 = new Scanner(System.in);
		String num2 = Scnum2.nextLine();
		
		int added = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println(added);
		Scnum1.close();
		Scnum2.close();
	}
}
