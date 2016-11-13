import java.util.ArrayList;

public class PersonArray {
	protected ArrayList<Person> person2;

	public PersonArray() {
		person2 = new ArrayList<>();
	}

	// INSERT HOURLY PAYMENT TEACHER
	public void hpTeacherInsert() {
		try {
			HourlyPayment newhpt = new HourlyPayment();
			newhpt.getinfo();
			person2.add(newhpt);
		} catch (Exception ex) {

			System.out.println("invalid value!!");
		}
	}

	// INSERT BASEPLUS HOURLY PAYMENT TEACHRE
	public void bhpTeacherInsert() {
		try {
			BasePlusHW newBpHw = new BasePlusHW();
			newBpHw.getinfo();
			person2.add(newBpHw);
		} catch (Exception ex) {

			System.out.println("invalid value!!");
		}
	}

	// INSERT FIXED SALARY TEACHER
	public void fxTeacherInsert() {
		try {
			FixedSalary fxteacher = new FixedSalary();
			fxteacher.getinfo();
			person2.add(fxteacher);
		} catch (Exception ex) {

			System.out.println("invalid value!!");
		}
	}

	public int search(String id) {

		for (int i = 0; i < person2.size(); i++) {

			if ((person2.get(i).getIdNUmber().equals(id))) {

				return i;
			}
		}
		return -1;
	}

	// METHOD FOR DELATION
	public boolean delete(String id) {

		if (search(id) >= 0)
			person2.remove(search(id));
		return true;
	}

	// METHOD FOR DISPLAYALL
	public void displayall() {

		for (Person currentPerson : person2)

			System.out.println(currentPerson.getClass().getName() + "\n"
					+ currentPerson);
	}

	public void displayClass(int item) {
		System.out.println(person2.get(item).getClass().getName());

	}

	public void idValidation(String id) {

		person2.remove(person2.lastIndexOf(id));

	}
}
