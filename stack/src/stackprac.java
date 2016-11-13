public class stackprac {

	private int maximoumNumber;
	private int[] stackarray;
	private int top;

	public stackprac(int s) {

		maximoumNumber = s;
		stackarray = new int[maximoumNumber];
		top = -1;

	}

	public int push(int j) {

		return stackarray[++top] = j;//first (top+1)==>top=0 and the stackarry[0]=j;
	}

	public int pop() {//first  return stackarry[top]==>(top-1)==> top==-1; 

		return stackarray[top--];
	}

	public int peek() {
		return stackarray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {

		return (top == maximoumNumber-1 );
	}
}
