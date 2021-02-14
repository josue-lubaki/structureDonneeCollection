package Exercice_11_1;
/* DataItem.java	*******************************************************************************
**********			@Authors : ISMAEL COULIBALY & XUAYO HU & JOSUE LUBAKI					*******
**************************************************************************************************/

class DataItem { // (could have more data)
	private final int iData; // data item (key)
//--------------------------------------------------------------

	public DataItem(int ii) // constructor
	{
		iData = ii;
	}

//--------------------------------------------------------------
	public int getKey() {
		return iData;
	}
//--------------------------------------------------------------
} // end class DataItem
