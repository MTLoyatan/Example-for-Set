import java.util.Scanner;

public class Menu extends PersonArray {

	protected PersonArray arr;
	protected Scanner input;
	protected int request;
	protected boolean exit;
	protected int index;
	public Menu() {

		arr = new PersonArray();
		input = new Scanner(System.in);
		this.request = request;
		this.exit = false;
		index= 0;
	}

	public void displayMenu() {

		do {

			System.out.println("1.insertHourlyTeacher.");
			System.out.println("2.insertBasePlusHourlyTeacher.");
			System.out.println("3.insertFixedsalaryTeacher.");
			System.out.println("4.search by ID");
			System.out.println("5.delete by ID");
			System.out.println("6.show all");
			System.out.println("7.exit\n\n");
			System.out.println("now choos az option");

			request = input.nextInt();
			switch (request) {
			case 1:
				arr.hpTeacherInsert();

				break;
			case 2:
				arr.bhpTeacherInsert();

				break;
			case 3:
				arr.fxTeacherInsert();
				break;
			case 4:
				System.out.println("enter the Id you want to find:");
				
				String keysearch = input.next();
				
				if (arr.search(keysearch)>= 0) {
					int index= arr.search(keysearch);	
					System.out.println("the Item was found in ");
					arr.displayClass(index);
				}
				else System.out.println("the Item was not found:");
				break;
				
			case 5:
				System.out.println("enter the Id you want to find:");
				String keydelet = input.next();
				if (arr.delete(keydelet)) 
					System.out.println("the Item was was deleted successfuly");
				else 
					System.out.println("the Item was not found:");
				break;
			case 6:
				
				arr.displayall();
				break;
			case 7:
				exit = true;
				break;
			default:
				System.out.println("enter a valid number:");
				break;
			}

		} while (!exit);

	}

}
