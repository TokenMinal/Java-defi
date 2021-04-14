package defi1;
import java.util.Scanner;
public class defi2 {
	public static void main(String[] args) {
		Scanner Scname = new Scanner(System.in);
		System.out.println("Nom :");
		String Name = Scname.nextLine();
		Scname.close();
		System.out.println("Bonjour, " + Name +", prêt à entrer dans le monde de la programmation");
	}
}
