package Exercice_5_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* LinkListApp.java	*******************************************************************************
 **********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
 **************************************************************************************************/

public class LinkListApp {

    public static void main(String[] args) throws IOException {
        int aKey = 0;
        Link aDataItem;
        LinkedList theList = new LinkedList();
        //********************************************************************************/
        while (true) // interact with user
        {
            try {
                System.out.print("Enter first letter of ");
                System.out.print("show, insert, delete, or find: ");
                char choice = getChar();
                switch (choice) {
                    case 's':
                        theList.display();
                        break;
                    case 'i':
                        System.out.print("Enter key value to insert: ");
                        aKey = getInt();
                        theList.insert(aKey);
                        break;
                    case 'd':
                        theList.delete();
                        break;
                    case 'f':
                        System.out.print("Enter key value to find: ");
                        aKey = getInt();
                        aDataItem = theList.find(aKey);
                        if (aDataItem != null) {
                            System.out.println("La valeur " + aKey + " a été trouvé");
                        } else
                            System.out.println("Could not find " + aKey);
                        break;
                    default:
                        System.out.print("Invalid entry\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("La valeur saisie n'est pas valide !!!");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Vous n'avez rien saisi comme option");
            } catch (NullPointerException e) {
                System.out.println("La valeur " + aKey + " n'existe pas");
            }
        }

    }

    /********************************************************************************/
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		return br.readLine();
    }

    // --------------------------------------------------------------
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    // -------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    // --------------------------------------------------------------

}
