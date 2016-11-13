import java.util.ArrayList;

public class Stack<E> {
	ArrayList<E> array;

	public Stack(int size) {
		int maxSize = (size > 0) ? size : 10;
		array = new ArrayList<E>(maxSize);
	}

	public Stack() {
		this(10);
	}

	public void push(E element) {
		array.add(element);
	}

	public E pop(){
		if(array.isEmpty())
			throw new EmptyStackException();		
		E element = array.remove(array.size() - 1);
		return element;
	}
	

	public  static <E> void print(java.util.List<E> listToPrint) {

		for (E element : listToPrint)
			System.out.print(" " + element);

	}

}
