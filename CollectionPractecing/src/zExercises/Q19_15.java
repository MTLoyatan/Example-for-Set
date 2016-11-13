package zExercises;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*Use a HashMap to create a reusable class for choosing one of the 13 predefined colors in class
Color. The names of the colors should be used as keys, and the predefined Color objects should be
used as values. Place this class in a package that can be imported into any Java program. Use your
new class in an application that allows the user to select a color and draw a shape in that color.*/
public class Q19_15 {
		
	private String[] keycolors={"black","white","blue","yellow","green","red","magenta","orange","pink","gray","cyen"};
	
	private Map<String, Color> colors = new  HashMap<String,Color>();
	
	
		
		public void mapCreating(){
			
			
			colors.put("black", Color.BLACK);
			colors.put("white", Color.WHITE);
			colors.put("blue", Color.BLUE);
			colors.put("yellow", Color.YELLOW);
			colors.put("green", Color.GREEN);
			colors.put("red", Color.RED);
			colors.put("magenta", Color.MAGENTA);
			colors.put("orange", Color.ORANGE);
			colors.put("pink", Color.PINK);
			colors.put("gray", Color.GRAY);
			colors.put("cyan", Color.CYAN);
			
			
						
			
		}
		
		public void displayColors(){
			
			
			Set<String> keyColors = colors.keySet();
			TreeSet<String> values = new TreeSet<String>(keyColors);
			for(String node : values  )
				
				System.out.print(" "+ node+"\n"+colors.get(node)+"\n");
				
			
		}
		
		public static void main(String args[]){
			
			
			Q19_15 object = new Q19_15();
			object.mapCreating();
			object.displayColors();
			
		}
		
		
}
