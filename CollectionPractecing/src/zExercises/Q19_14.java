package zExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Q19_14 {
	
	private Map<String, Integer> map;
	Scanner scanner;
	
	
	
	public Q19_14() {
		super();
		this.map = new HashMap<String,Integer>();
		scanner = new Scanner(System.in);
		
		creatMap();
		displayMap();
	}

	
	private void  creatMap(){
		
		System.out.println( "Enter a string:" );
		String input= scanner.next();
		//StringTokenizer  tokenizer = new StringTokenizer(input);
		String[] tokenazier = input.split("");
		//while ( tokenizer.hasMoreTokens() ){
			//String word = tokenizer.nextToken().toLowerCase();
			for(String s :tokenazier)
			{	
			if(map.containsKey(s))
			{
				int count=map.get(s);
				map.put(s, count+1);
			}
			else
				map.put(s, 1);
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
		new Q19_14();
	}

}
