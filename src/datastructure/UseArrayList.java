package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		//Created arraylist and added to it.

		ArrayList<String> array = new ArrayList<>();
		 array.add("Fariha");
		 array.add("Rafid");
		 array.add("Yazan");
		 array.add("Zayan");
	//	System.out.println("Household kids: " + array);


		//To get from array
		System.out.println(array.get(0));


		// To remove from list
		array.remove("Zayan");
		System.out.println("with remove: " + array);


		// using Iterator

		// WHile Loop


		Iterator it = array.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		// for each loop

		Iterator i = array.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}












	}

}
