import java.util.Scanner;

public class myMenue2 {

	MyArrayList2 list;
	Scanner input;
	boolean exit;
	int request;

	public myMenue2() {

		list = new MyArrayList2();
		input = new Scanner(System.in);
		exit = false;
		request = 0;

	}

	public void menu() {

		do {

			System.out.println("1.insret new Item");
			System.out.println("2.search for an Item");
			System.out.println("3.delete an Item");
			System.out.println("4.display all items");
			System.out.println("5.exit");

			System.out.println("select an Item");

			request = input.nextInt();

			switch (request) {
			case 1:
				System.out.println("enter your number");

				int number = input.nextInt();
				if (list.insert(number))
					System.out.println("number inserted");
				else
					System.out.println("error accured while inserting");

				break;

			case 2:
				System.out.println("insert your search Item");
					
				
				int index = input.nextInt();
				if (list.search(index) >= 0) {

					System.out.println("the value was found and " + "its in "
							+ list.search(index));
				} else
					System.out.println("the value does not exist!");
				break;
			case 3:
				System.out.println("insert your Item");

				if (list.delete(input.nextInt()))

					System.out.println("the item was deleted ");
				else
					System.out.println("the item was not deleted ");
				break;
						
			case 4:
						list.displayItems();
				break;
			case 5:
				exit=true;
				break;
			default:
				System.out.println("number is invalid");
				break;
			}

		} while (!exit);

	}
}
