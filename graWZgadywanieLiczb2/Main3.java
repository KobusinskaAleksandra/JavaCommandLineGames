package graWZgadywanieLiczb2;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach. Wciśnij enter.");
		scan.nextLine();
		int min=0;
		int max=1000;
		String odp="";
		while(true) {
		int guess=((max-min)/2)+min;		
		System.out.println("Zgaduję: " + guess);
		System.out.println("Zgadłem?");
		odp=scan.next();
		if(odp.equals("tak")) {
			System.out.println("Wygrałem!");
			break;
		}
		else  {
			System.out.println("Za dużo?");
			odp=scan.next();
			if (odp.equals("tak")) {
				max=guess;
			}
			else {
				System.out.println("Za mało?");
				odp=scan.next();
				if(odp.equals("tak")) min=guess;
				else System.out.println("Nie oszukuj!");
				}
		}
		}
		scan.close();
	}
}
			
