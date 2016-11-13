import java.util.Scanner;

public class HourlyPayment extends Teacher {

	protected double workingHours;
	protected double perHourPayment;
	protected Scanner input = new Scanner(System.in);

	public HourlyPayment() {
		this("", "", "", "", 0.0, 0.0);

	}

	public HourlyPayment(String id) {
		this("", "", id, "", 0.0, 0.0);
	}

	public HourlyPayment(HourlyPayment hourlypayment) {
		this(hourlypayment.getFirstNAme(), hourlypayment.getLastNAme(),
				hourlypayment.getIdNUmber(), hourlypayment.getCoursNAme(),
				hourlypayment.getWorkingHours(), hourlypayment
						.getPerHourPayment());
	}

	public HourlyPayment(String firsname, String lastname, String idnumber,
			String coursname, double workingHours, double perHourPayment) {
		super(firsname, lastname, idnumber, coursname);
		setWorkingHours(workingHours);
		setPerHourPayment(perHourPayment);
	}

	public double getWorkingHours() {

		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public double getPerHourPayment() {
		return perHourPayment;
	}

	public void setPerHourPayment(double perHourPayment) {
		this.perHourPayment = perHourPayment;
	}

	@Override
	public String toString() {
		return String.format("%s%16s%.2f\n%16s%.2f", super.toString(),
				"workinghours: ", getWorkingHours(), "perHourPayment: ",
				getPerHourPayment());
	}

	@Override
	public double ernings() {
		// TODO Auto-generated method stub
		return getWorkingHours() * getPerHourPayment();
	}
		
	@Override
	public Person getinfo() {
		
		// TODO Auto-generated method stub
		System.out.println("firstname");
		setFirstNAme(input.next());
		System.out.println("lastname:");
		setLastNAme(input.next());
		System.out.println("id:");
		setIdNUmber(input.next());
		System.out.println("coursname:");
		setCoursNAme(input.next());
		System.out.println("workinghours:");
		setWorkingHours(input.nextDouble());
		System.out.println("perhourPayment:");
		setPerHourPayment(input.nextDouble());
		return this;
	}
}
