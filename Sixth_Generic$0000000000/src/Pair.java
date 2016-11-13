public class Pair<F, S> {

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

	private F first;
	private S second;

	public Pair() {
	
	}

	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

}
