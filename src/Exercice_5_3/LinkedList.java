package Exercice_5_3;
/* LinkedList.java	*******************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/
class LinkedList {
	private Link current;
	private int nItems; // Taille de la liste
	/********************************************************************************/
	public LinkedList() {
		current = null;
		nItems = 0;
	}
	/********************************************************************************/
	public boolean isEmpty() {
		return current == null;
	}
	/********************************************************************************/
	public long getItems() {
		return nItems;
	}
	/********************************************************************************/
	public void step() {
		current = current.next;
	}
	/********************************************************************************/
	public long peek() {
		return current.lData;
	}
	/********************************************************************************/
	public void insert(long value) // inserts new link after current link
	{
		Link newLink = new Link(value);
		if (isEmpty()) {
			current = new Link(value);
			current.next = current;
		} else {
			
			newLink.next = current.next;
			current.next.previous = newLink;
			
		}
		newLink.previous = current;
		current.next = newLink;
		nItems++;
	}
	/*******************************************************************************/
	public Link find(long value) {
		Link index = current;
		for(int i = 0; i < nItems; i++)
		{
			if(index.lData == value) 
			{
				return current;
			}
			else 
				index = index.next;
		}
		return null;
	}
	/********************************************************************************/
	/* SUPPRESSION À PARTIR DE LA DERNIÈRE INSERTION */
	public Link delete() {
		if (isEmpty()) {
			System.out.println("La liste est vide.");
			return null;
		} else if (nItems == 1) {
			current = null;
			nItems = 0;
			return null;
		} else {
			Link temp = current.next;
			current.next = current.next.next;
			nItems--;
			return temp;
		}
	}
	/********************************************************************************/
	public void display() {
		Link index = current;
		if (isEmpty())
			System.out.println("La liste circulaire est vide");
		else {
			System.out.print("La liste circulaire partant du current vers la gauche: ");
			for (int i = 0; i < nItems; i++) {
				System.out.print(index.lData + " ");
				index = index.next;
			}
			System.out.println("");
		}
	}
}
