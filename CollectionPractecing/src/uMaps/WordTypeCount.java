package uMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class WordTypeCount {
	
	private Map<String, Integer> map;
	Scanner scanner;
	
	
	
	public WordTypeCount() {
		super();
		this.map = new HashMap<String,Integer>();
		scanner = new Scanner(System.in);
		
		creatMap();
		displayMap();
	}

	
	private void  creatMap(){
		
		System.out.println( "Enter a string:" );
		String input= scanner.nextLine();
		StringTokenizer  tokenizer = new StringTokenizer(input);
		
		while ( tokenizer.hasMoreTokens() ){
			String word = tokenizer.nextToken().toLowerCase();
			
			
			if(map.containsKey(word))
			{
				int count=map.get(word);
				map.put(word, count+1);
			}
			else
				map.put(word, 1);
	}
		
	}
	
	private void displayMap(){
		
		Set<String> keys= map.keySet();
		TreeSet< String > sortedKeys = new TreeSet< String >( keys );
		System.out.println( "Map contains:\nKey\t\tValue" );
		for ( String key : sortedKeys )
			System.out.printf("%-10s%10s\n",key,map.get(key));
		System.out.printf("\nsize:%d\nisEmpty:%b\n",map.size(),map.isEmpty());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordTypeCount();
	}

}
