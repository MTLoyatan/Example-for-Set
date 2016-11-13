import java.util.Scanner;

public class DisplayMenu {

	private boolean exit;
	private Myarray arr;
	private Scanner input;
	private int request;

	public DisplayMenu() {

		exit = false;
		arr = new Myarray();
		input = new Scanner(System.in);
		request = 0;
	}

	public void menu() {

		do {

			System.out.println("1.insertion");
			System.out.println("2.search");
			System.out.println("3.deletion");
			System.out.println("4.show all items");
			System.out.println("5.exit");
			request = input.nextInt();
			switch (request) {
			case 1:
				System.out.println("enter an integer number:");
				arr.insert(input.nextInt());

				break;

			case 2:
				System.out.println("enter a number to search:");
				int index = input.nextInt();
				if (arr.serach(index) >= 0) {

					System.out.println("the value was found and " + "its in "
							+ arr.serach(index));
				} else
					System.out.println("the value does not exist!");
				break;
			case 3:
				System.out.println("enter a number to search:");
				if (arr.delete(input.nextInt())) {
					System.out.println("deletion was successful");
				} else
					System.out.println("the value does not exist!");
				break;
			case 4:
				arr.display();
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("enter a valid number:");
				break;
			}

		} while (!exit);

	}

}
