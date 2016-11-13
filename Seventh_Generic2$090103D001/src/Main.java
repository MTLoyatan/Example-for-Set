import java.util.ArrayList;


class Machine{

	@Override
	public String toString() {
		return "I am a machine...";
	}
	
	public void start(){
		System.out.println("Starting...");
	}
	
}


class Camera extends Machine{
	@Override
	public String toString() {
		return "I am a camera...";
	}
	
	public void snap(){
		System.out.println("Snapshot...");
	}
}


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Machine> ml = new ArrayList<Machine>();
		ml.add(new Machine());
		ml.add(new Machine());
		
		ArrayList<Camera> cl = new ArrayList<Camera>();
		cl.add(new Camera());
		cl.add(new Camera());
		cl.add(new Camera());
		
		
		//ArrayList<Machine> ml2 = cl;
		
		showList(cl);

	}
	
	public static void showList(ArrayList<? extends Machine> inputList){
		for(Machine element : inputList){
			System.out.printf("%s ",element);
			if(element instanceof Camera){
				Camera myCamera = (Camera) element;
				myCamera.snap();
			}
		System.out.println();
		}
	}

}
