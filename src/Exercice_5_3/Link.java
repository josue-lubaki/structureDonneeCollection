package Exercice_5_3;
/** Link.java	***********************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/
class Link {
	public long lData;
	public Link next;
	public Link previous;

	public Link(long value) {
		lData = value;
	}

	public void displayLink() {
		System.out.print(lData + " ");
	}
}

////////////////////////////////////////////////////////////////