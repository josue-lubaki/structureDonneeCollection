package Exercice_5_2;
/* Link.java	***********************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/

//doublyLinked.java
//demonstrates doubly-linked list
//to run this program: C>java DoublyLinkedApp
////////////////////////////////////////////////////////////////

class Link {
	public long dData; // data item
	public Link next; // next link in list
	public Link previous; // previous link in list
//-------------------------------------------------------------

	public Link(long d) // constructor
	{
		dData = d;
	}

//-------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(dData + " ");
	}
//-------------------------------------------------------------
} // end class Link