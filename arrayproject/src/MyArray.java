public class MyArray {

	private int nItems;

	private int[] arr;

	public MyArray() {

		setnItems(nItems);
		arr = new int[20];
	}
	

	public boolean insert(int value) {
		arr[nItems++] = value;
		return true;
		// nItems++;
	}
			
	
	
	
	
	
	
	
		public int getnItems() {
		return nItems;
	}


	public void setnItems(int nItems)
	{
		
		this.nItems = nItems;
		
	}


	public int search(int keySearch) {
		for (int i = 0; i < getnItems(); i++) 
			if (arr[i] == keySearch)
				return i;
		return -1;
		}

	public boolean delete(int keyDelete) {
		if (search(keyDelete) >= 0) {
			// some code here for deletion
			int index = search(keyDelete);
			//left shift
		
			for (int i = index; i < getnItems(); i++)
				arr[i] = arr[i + 1];
			nItems--;
			return true;
		} else
			return false;
	}
	
	public void display(){
		for(int i=0;i<getnItems();i++)
			System.out.print(arr[i]+" ");
		System.out.println(" ");
	}
}
