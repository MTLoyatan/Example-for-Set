package tSetPackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetTest {
	private static final String colors[] = { "red", "white", "blue",
	
		"green", "gray", "orange", "tan", "white", "cyan",
	
		"peach", "gray", "orange" };
		
	public HashsetTest(){
		
		List<String> list = Arrays.asList(colors);
		System.out.printf(" %s",list);
		System.out.println();
		printnonduplicat(list);
		System.out.println();
		
	}
		
		public void  printnonduplicat(Collection<String> collection){
			
			Set<String> set = new HashSet<>(collection);
			
			System.out.println("show Nunduplicate  ");
			for( String node : set)
				System.out.print(" "+node);
			
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new HashsetTest();
	}

}
