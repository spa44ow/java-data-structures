package dataStructures;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String args[]) {

		Enumeration days;

		Vector dayName = new Vector();

		dayName.add("Monday");
		dayName.add("Tuesday");
		dayName.add("Wednesday");
		dayName.add("Thursday");

		days = dayName.elements();

		while (days.hasMoreElements()) {

			System.out.println(days.nextElement());
		}

	}
}