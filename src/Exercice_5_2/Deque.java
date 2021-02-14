package Exercice_5_2;
/* Deque.java	***********************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/
class Deque {

	private final DoublyLinkedList join;

	// --------------------------------------------------------------
	public Deque() // constructor
	{
		join = new DoublyLinkedList();

	}

	public void peekLeft() {
		join.peekFirst();
	}

	public void peekRight() {
		join.peekLast();
	}

	// --------------------------------------------------------------
	public void insertLeft(long j) // put item at left of deque
	{
		join.insertFirst(j);

	}

	// --------------------------------------------------------------
	public void insertRight(long j) // put item at right of deque
	{
		join.insertLast(j);

	}

	// --------------------------------------------------------------
	public void removeLeft() // take item from left of deque
	{
		join.deleteFirst();

	}

	// --------------------------------------------------------------
	public void removeRight() // take item from right of deque
	{
		join.deleteLast();

	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if deque is empty
	{
		return join.isEmpty();
	}

	// --------------------------------------------------------------

	// --------------------------------------------------------------
	// --------------------------------------------------------------
	public void display() {
		System.out.println("\n***********************************************************************");
		System.out.print("Deque : ");
		join.displayForward();
		System.out.println("***********************************************************************");

	} // end display()
	// --------------------------------------------------------------
} // end class Deque