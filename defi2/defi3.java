package defi2;

import java.util.Scanner;

public class defi3 {
	public static void main(String[] args) {
		System.out.println("Entrer un nombre entre 1 et 12 et le mois correspondant sera retourner");
		Scanner SCmonth = new Scanner(System.in);
		String Smonth = SCmonth.nextLine();
		int month = Integer.parseInt(Smonth);

		switch(month) {
			case 1:
				System.out.println("Janvier");
				break;
			case 2:
			    System.out.println("Février");
				break;
			case 3:
				System.out.println("Mars");
				break;
			case 4:
				System.out.println("Avril");
				break;
			case 5:
				System.out.println("Mai");
				break;
			case 6:
				System.out.println("Juin");
				break;
			case 7:
				System.out.println("Juillet");
				break;
			case 8:
				System.out.println("Août");
				break;
			case 9:
				System.out.println("Septembre");
				break;
			case 10:
				System.out.println("Octobre");
				break;
			case 11:
				System.out.println("Novembre");
				break;
			case 12:
				System.out.println("Décembre");
				break;
			default:
				System.out.println("il n’existe pas de mois associé à ce nombre");
		}
		SCmonth.close();
	}
}
