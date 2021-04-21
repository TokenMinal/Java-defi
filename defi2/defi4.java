package defi2;

import java.util.Scanner;

public class defi4 {
	public static void main(String[] args) {
		Scanner SCnum = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("entrer un nombre: ");
			String Snum = SCnum.nextLine();
			int num = Integer.parseInt(Snum);
			if (num <= 25) {
				boolean prime = false;
				for(int i = 2; i<=num/2; i++) {
					int temp = num%i;
					if (temp == 0) {
						prime = true;
						break;
					}
				}
				
				if (prime == false  && num == 1) {
					System.out.println("ce nombre n'est pas un nombre premier");
				}
				else if (prime == true) {
					System.out.println("ce nombre n'est pas un nombre premier");
				}
				else if (prime == false) {
					System.out.println(num + " est un nombre premier");
				}
				else {
					System.out.println("uhhhh");
					SCnum.close();
				}
			}
			else {
				System.out.println("nombre plus petit que 25");
			}

		}
	}
}
