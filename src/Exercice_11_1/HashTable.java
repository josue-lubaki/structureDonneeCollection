package Exercice_11_1;
/* HashTable.java	*******************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/
class HashTable {
	private final DataItem[] hashArray; // array holds hash table
	private final int arraySize;
	private final DataItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1); // deleted item key is -1
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.print("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println();
	}

	// -------------------------------------------------------------
	public int hashFunc(int key) {
		return key % arraySize; // hash function
	}

	// -------------------------------------------------------------
	public void insert(DataItem item) // insert a DataItem
	// (assumes table not full)
	{
		int key = item.getKey(); // extract key
		int hashVal = hashFunc(key); // hash the key
		int i = 1;
		
		// until empty cell or -1,
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
			if(i > arraySize) { 
				break;
			}
			else {
				hashVal = hashVal + (i * i);
				hashVal %= arraySize; // wraparound if necessary
				i++;
			}
		}
		
		/* AVANT INSERTION
		 * VERIFIER QUE LA VALEUR N'ECRASE PAS UNE EXISTANTE
		 * VERIFIER QUE L'EMPLACEMENT NE CONTIENT QUE, SOIT ** OU -1
		 * 
		 * */
		 
		if(hashArray[hashVal] == null || hashArray[hashVal].getKey() == -1) 
			hashArray[hashVal] = item; // insert item
		else {
			System.out.println("Le nombre " + key + " ne peut être inseré au risque d'écraser le nombre " 
			+ hashArray[hashVal].getKey() + " déjà existant à l'emplacement " + hashVal);
		}
		
	} // end insert()
	// -------------------------------------------------------------

	public void delete(int key) // delete a DataItem
	{
		int i = 1;
		int hashVal = hashFunc(key); // hash the key
		while (hashArray[hashVal] != null && i<=arraySize) // until empty cell, ou avoir parcouru l'ensemble du tableau
		{ // found the key?
			if (hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return; // return item
			}
			hashVal = hashVal + (i * i); // go to next cell
			hashVal %= arraySize; // wraparound if necessary
			i++;
		}
	} // end delete()
	// -------------------------------------------------------------

	public DataItem find(int key) // find item with key
	{
		
		int hashVal = hashFunc(key); // hash the key
		int i = 1;

		while (hashArray[hashVal] != null && i <= arraySize) // until empty cell, ou avoir parcouru l'ensemble du tableau
		{ // found the key?
			if (hashArray[hashVal].getKey() == key)
				return hashArray[hashVal]; // yes, return item
			hashVal = hashVal + (i * i); // go to next cell
			hashVal %= arraySize; // wraparound if necessary
			i++;
		}
		return null; // can’t find item
	}
	// -------------------------------------------------------------
} // end class HashTable
