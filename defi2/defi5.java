package defi2;

import java.util.Scanner;

public class defi5 {
	public static void main(String[] args) {
		Scanner SCprix = new Scanner(System.in);
		int prixNo = 0;
		for (int i = 0; i < 5; i++){
			System.out.print("entrer un prix: ");
			String Sprix = SCprix.nextLine();
			int prix = Integer.parseInt(Sprix);
			prixNo = prixNo + prix;
			System.out.println("sous-total: " + prixNo);
		}
		System.out.println("Total: " + prixNo * 1.15);
		SCprix.close();
	}
}
