import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.print.attribute.standard.MediaSize.Other;

public class CollectionTest {

	private String[] countreis = { "us", "canada", "iran", "iraq", "japan" };
	private String[] sanction = { "iran", "iraq", "north korea" };

	public CollectionTest() {
		super();

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		for (String country : countreis)
			list1.add(country);

		for (String country : sanction)
			list2.add(country);

		System.out.println(" list1 are as follows:");		

		outPutList(list1);
		System.out.println(" list2 are as follows:");

		outPutList(list2);
		
		removeSanctions(list1, list2);
		System.out.println(" list1  after removing are as follows:");
		outPutList(list1);
	
		//List<String> list1 = new LinkedList<String>();
		//List<String> list2 = new LinkedList<String>();
	
		for (String country : sanction)
			list2.add(country);
		for (String country : countreis)
			list1.add(country);
		System.out.println(" list1 are as follows:");		
		

		outPutList(list1);
		
		System.out.println(" list2 are as follows:");		
		
				outPutList(list2);
		list1.addAll(list2);
		list2.clear();
		list2=null;
	
System.out.println(" list1  after concatination are as follows:");		
		
		outPutList(list1);
		
		changeToUpperCase(list1);
		
 System.out.println(" list1  after changing are as follows:");		
		
		outPutList(list1);
			
		
	outPutReverseOrder(list1);
				
	}
	
	public void changeToUpperCase(List<String> list){
		
		
		ListIterator<String> itrator = list.listIterator();
		
		while(itrator.hasNext()){
			String country = itrator.next();
			itrator.set(country.toUpperCase());
		}
		
		
	}
	
public void outPutReverseOrder(List<String> list){
		
		
		ListIterator<String> itrator = list.listIterator(list.size());
		
		while(itrator.hasPrevious()){
			System.out.print(" "+itrator.previous());
		}
		
		System.out.println();
		
		
	}


	public void outPutList(List<String> list) {

		for (String element : list)
			System.out.print(" " + element);
		
		System.out.println();
	}

	public void removeSanctions(Collection<String> countries,
			Collection<String> sanctions) {
			
		Iterator<String> iterator = countries.iterator();
		
		while(iterator.hasNext()){
			
			
			if(sanctions.contains(iterator.next()))
				iterator.remove();
			
		
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CollectionTest();	
		
	}

}
