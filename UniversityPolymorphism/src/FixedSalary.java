import java.util.Scanner;

public class FixedSalary extends Teacher {

	public double fixedSalary;
	protected Scanner input= new Scanner(System.in);

	public FixedSalary() {

		this("", "", "", "", 0.0);

	}

	public FixedSalary(String idnumber) {

		this("", "", idnumber, "", 0.0);
	}

	public FixedSalary(FixedSalary fixedsalary) {
		this(fixedsalary.getFirstNAme(), fixedsalary.getLastNAme(), fixedsalary
				.getIdNUmber(), fixedsalary.getCoursNAme(), fixedsalary
				.getFixedSalary());

	}

	public FixedSalary(String firstname, String lastname, String idnumber,
			String coursname, double fixedSalary) {
		super(firstname, lastname, idnumber, coursname);
		setFixedSalary(fixedSalary);
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public String toString() {
		return String.format("%s%16s", super.toString(), "fixedsalary",
				getFixedSalary());
	}

	@Override
	public double ernings() {
		// TODO Auto-generated method stub
		return getFixedSalary();
	}
	@Override
	public Teacher getinfo() {
		// TODO Auto-generated method stub
		System.out.println("firstname");
		setFirstNAme(input.next());
		System.out.println("lastname:");
		setLastNAme(input.next());
		System.out.println("id:");
		setIdNUmber(input.next());
		System.out.println("coursname:");
		setCoursNAme(input.next());
		System.out.println("fixedsalary:");
		setCoursNAme(input.next());
		return this;
	}
}
