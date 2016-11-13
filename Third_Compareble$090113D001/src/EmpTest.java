import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "a", "c", "c", "b", "d", "f", "e", "d" };
		List<Employee> employes = new ArrayList<Employee>();
		List<String> liststr = new ArrayList<String>();
		employes.add(new Employee(100, "ali", "ahmadi"));
		employes.add(new Employee(110, "reza", "ahmadi"));
		employes.add(new Employee(120, "roya", "qasemi"));
		employes.add(new Employee(130, "bita", "akbari"));
		employes.add(new Employee(140, "bita", "akbari"));
		employes.add(new Employee(110, "reza", "ahmadi"));

		Scanner input = new Scanner(System.in);

		System.out.println("enter key search ");

		int keysearch = input.nextInt();

		Collections.sort(employes, new EmpComperable2());

		int location = Collections.binarySearch(employes, new Employee(
				keysearch, "", ""), new EmpComperable2());

		if (location > 0)
			System.out.println("Yes, exists in " + location + " index");
		else
			System.out.println("No, dosnt exists.");

		System.out.printf("%3s%10s%8s\n", "Id", "lname", "fname");

		for (Employee emp : employes)

			System.out.println(emp);

	}

}
