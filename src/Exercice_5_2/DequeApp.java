package Exercice_5_2;
/* DequeApp.java	********************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DequeApp {
	private static final Scanner scan_1 = new Scanner(System.in); // SCANNER POUR LES VARIABLES (LETTRES)
	private static final Scanner scan_2 = new Scanner(System.in); // SCANNER POUR LES VARIABLES (CHIFFRES)

	public static void main(String[] args) {
		Deque theDeque = new Deque();

		while (true) {
			long value;
			String choice;
			System.out.println();
			
			if (theDeque.isEmpty())
				System.out.println("\t*** Deque is empty. No deletions. ***");
			
			// MENU
				System.out.println("Enter first letter of : ");
				System.out.println("\t(i) insertLeft, \n\t(I) InsertRight, ");
				System.out.println("\t(r) removeLeft, \n\t(R) RemoveRight, ");
				System.out.print("\t(p) peekLeft, \n\t(P) peekRight, or display (d): ");
			
			choice = scan_1.nextLine();
			try {
				switch (choice) {
				case "d":
					theDeque.display();
					break;
				case "i":
					System.out.print("Enter value to insert left: ");
					value = scan_2.nextLong();
					theDeque.insertLeft(value);
					break;
				case "I":
					System.out.print("Enter value to insert right: ");
					value = scan_2.nextLong();
					theDeque.insertRight(value);
					break;
				case "r":
					theDeque.removeLeft();
					System.out.println("Removed left is successful");
					break;
				case "R":
					theDeque.removeRight();
					System.out.println("Removed right is successful");
					break;
				case "p" :
					System.out.println("*****************************************************");
					System.out.print("Elément au sommet (de gauche vers la droite) : ");
					theDeque.peekLeft();
					System.out.println("\n*****************************************************");
					break;
				case "P" :
					System.out.println("*****************************************************");
					System.out.print("Elément au sommet (de droite vers la gauche) : ");
					theDeque.peekRight();
					System.out.println("\n*****************************************************");
					break;
				default:
					System.out.print("Invalid entry\n");
				} // end switch
			} catch (NullPointerException e) {
				System.err.println("Cette Opération est impossible puisque la Liste est vide");
			} catch(InputMismatchException e) {
				System.out.println("Les caractères saisis sont non-valides");
				choice = "";
			}
			
			if(choice.equals("")) // CONDITION POUR QUITTER L'APPLICATION [ENTER]
				break;
			
		}
	}
}
