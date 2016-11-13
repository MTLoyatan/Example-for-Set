package CollectionAlgorithms;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimeComparator implements Comparator<Time> {

	public int compare(Time time1, Time time2) {
		// TODO Auto-generated method stub
		int hourCompare = time1.getHours() - time2.getHours();

		if (hourCompare != 0)

			return hourCompare;
		int minutecompare = time1.getMinutes() - time2.getMinutes();
		if (minutecompare != 0)
			return minutecompare;

		int secondcompare = time1.getSeconds() - time2.getSeconds();

		return secondcompare;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Time> list = new ArrayList<Time>();

		list.add(new Time(6, 24, 34));

		list.add(new Time(18, 14, 58));

		list.add(new Time(6, 05, 34));

		list.add(new Time(12, 14, 58));

		list.add(new Time(6, 24, 22));
		
		System.out.println("\n");
		System.out.printf("%s\n",list);
		Collections.sort(list, new  TimeComparator());
		System.out.println("sorted list:  ");
		System.out.printf("%s",list);
	}

}
