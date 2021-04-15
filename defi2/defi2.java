package defi2;

import java.util.Scanner;

public class defi2 {
	public static void main(String[] args) {
		Scanner SCnum = new Scanner(System.in);
		String Snum = SCnum.nextLine();
		int num = Integer.parseInt(Snum);
		if (num >= 0 && num <= 10) {
			System.out.println("entre 0 et 10");
		}
		else if (num < 0) {
			System.out.println("plus petit que 0");
		}
		else if (num > 10) {
			System.out.println("plus grand que 10");
		}
		else {
			System.out.println("uhhh");
		}
		SCnum.close();
	}
}
