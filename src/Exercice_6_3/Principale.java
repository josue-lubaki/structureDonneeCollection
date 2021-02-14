package Exercice_6_3;
/* Principale.java	*******************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/
import java.util.Scanner;

public class Principale {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\n\t\tEXERCICE 6.3\tPAGE 313\n\t\t************");
		String aString = null;
		String bString = null;
		int a;
		int b;

		System.out.println("\nLa methode power(A,B) c'est-à-dire le nombre A élevé à la puissance B" +
				"\n----- \tExemple\t -----\nvalue A : 5 \nValue B : 2 \nOutput : power(5,2) = 25");

		try {
			while (true) {
				System.out.println("\nLa methode power(A,B) c'est-à-dire le nombre A élevé à la puissance B");
				
				System.out.print("Entrer la valeur de A : ");
				aString = scan.nextLine();
				
				// CONDITION DE SORTIE
				if(aString.equals(""))
					break;
				
				do {
				System.out.print("Entrer la valeur de B : ");
				bString = scan.nextLine();
				}while(bString.equals(""));
				
				a = Integer.parseInt(aString);
				b = Integer.parseInt(bString);
				
				System.out.println("power(" + a + "," + b + ") = " + power(a, b));
			}
		} catch (NumberFormatException e) {
			System.out.println("\npower(" + aString + "," + bString + ") --> INCORRECT \nLes caractères saisis ne sont pas pris en charge\nVeuillez Redémarrer l'application");
		}
	}

/////////////////////			END MAIN 			/////////////////////
	
	/*******************************************************************/
	// FONCTION POWER(n,k) QUI PERMET D'ELEVER LE NOMBRE n À LA PUISSANCE k
	public static int power(int n, int k) {
		if (k == 0)
			return 1;
		else {
			return n * power(n, k - 1);
		}
	}
}
