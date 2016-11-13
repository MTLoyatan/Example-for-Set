public class BasePlusHW extends HourlyPayment {

	protected double basePayment;

	public BasePlusHW() {
		this("", "", "", "", 0.0, 0.0, 0.0);
	}

	public BasePlusHW(String idnumber) {
		this("", "", idnumber, "", 0.0, 0.0, 0.0);
	}
	public BasePlusHW(double basepayment){
		this("","","","",0.0,0.0,basepayment);
	}

	public BasePlusHW(BasePlusHW basePlusHW) {

		this(basePlusHW.getFirstNAme(), basePlusHW.getLastNAme(), basePlusHW
				.getIdNUmber(), basePlusHW.getCoursNAme(), basePlusHW
				.getWorkingHours(), basePlusHW.getPerHourPayment(), basePlusHW
				.getBasePayment());
	}

	public BasePlusHW(String firstname, String lastname, String idnumber,
			String coursname, double workingHours, double perHourPayment,
			double basePayment) {
		super(firstname, lastname, idnumber, coursname, workingHours,
				perHourPayment);
		setBasePayment(this.basePayment);
	}

	public double getBasePayment() {
		return basePayment;
	}

	public void setBasePayment(double basePayment) {
		this.basePayment = basePayment;
	}

	@Override
	public String toString() {
		return String.format("%s\n%16s%s\n", super.toString(), "basepayment: ",
				getBasePayment());
	}

	@Override
	public double ernings() {
		// TODO Auto-generated method stub
		return super.ernings() + getBasePayment();
	}
@Override
public Person getinfo() {
	// TODO Auto-generated method stub
	super.getinfo();
	System.out.println("basepayment");
	setBasePayment(input.nextDouble());
	return this;
}
}
