package graWZgadywanieLiczb;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		zgadnijLiczbe();	
	}
		
	static void zgadnijLiczbe () {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		int random = rand.nextInt(101);
		int next;
    	while(true) {
    		System.out.println("Zgadnij liczbę!");
    		while(!input.hasNextInt()) {
    			input.next();
    			System.out.println("To nie jest liczba");	
    		}
    	next = input.nextInt();
    		if (next<random) {
    			System.out.println("Za mało!");
    		}
    		else if (next>random) {
    			System.out.println("Za dużo!");
    		}
    		else { 
    			System.out.println("Zgadłeś!");
    			break;
    		}
    		}
    	input.close();
			
    	}
 }
    	
    	
  
