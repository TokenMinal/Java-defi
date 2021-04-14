package defi1;
import java.util.Scanner;

public class defi4 {
	public static void main(String[] args) {
		Scanner Scnum1 = new Scanner(System.in);
		System.out.println("Entre un nombre :");
		String num1 = Scnum1.nextLine();

		System.out.println("Entre un autre nombre :");
		Scanner Scnum2 = new Scanner(System.in);
		String num2 = Scnum2.nextLine();
		
		int added = Integer.parseInt(num1) + Integer.parseInt(num2);
		int minus = Integer.parseInt(num1) - Integer.parseInt(num2);
		int multiplied = Integer.parseInt(num1) * Integer.parseInt(num2);
		int divided = Integer.parseInt(num1) / Integer.parseInt(num2);
		int modulo = Integer.parseInt(num1) % Integer.parseInt(num2);
		System.out.println("Leur somme est " + added + ", leur différence est " + minus + ", leur produit est " + multiplied + ", leur division est " + divided + " et le reste de leur division est " + modulo);
		Scnum1.close();
		Scnum2.close();
	}
	
}
