import java.util.Scanner;


public class ArraylistMenu {
	private boolean exit;
	private int request;
	private MyarrayList arr;
	private Scanner input;

	public ArraylistMenu() {
		exit = false;
		setRequest(request);
		input = new Scanner(System.in);
		arr = new MyarrayList();
	}

	public void setRequest(int request) {
		
		this.request = request;
	}

	public void display() {
		// TODO Auto-generated method stub

		do {
			System.out.println("1.insret new Item");
			System.out.println("2.search for an Item");
			System.out.println("3.delete an Item");
			System.out.println("4.display all items");
			System.out.println("5.exit");

			request = input.nextInt();
			switch (request) {
			case 1:
				System.out.println("enter an integer number:");
				arr.insert(input.nextInt());
				break;
			case 2:
				System.out.println("enter an integer number:");
				int keySearch = input.nextInt();
				if (arr.search(keySearch) >= 0) {
					System.out.println("Item found!");
					System.out.println("and the Item is in index number "
							+ arr.search(keySearch));
				} else {
					System.out.println("Item Not found!");
				}
	
				break;
			case 3:
				System.out.println("enter an integer number:");
				if(arr.delete(input.nextInt()))
					System.out.println("deletion was successful");
				else {
					System.out.println("Item does not exist!");
				}
				break;
			case 4:
				
				arr.displayItems();
				break;
			
			case 5:
				
				exit=true;
				break;
			
			default:
				System.out.println(" enter a valid number");
				break;
			}
		} while (!exit);
	}

}
