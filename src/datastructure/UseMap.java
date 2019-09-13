package datastructure;

import java.util.*;

public class UseMap {


	public static void main(String[] args) {

		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		// Create map and add data
		Map<String, String> map = new HashMap<String,String>();
		map.put("NY", "Manhattan");
		map.put("NJ", "Patterson");
		map.put("CT", "Hartford");

		// Retrieve from Map
		System.out.println("Retrieved from Map:");
		System.out.println(map.get("NY"));


		// Creating new arraylist
		List<String> boroughsOfNY = new ArrayList<String>();
		boroughsOfNY.add("Queens");
		boroughsOfNY.add("Brooklyn");
		boroughsOfNY.add("Bronx");
		boroughsOfNY.add("Staten Island");


		// Creating Map1 that takes in the list^ as variables.
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		map1.put("NY",boroughsOfNY);


		System.out.println("retrieved with for each loop:");
		// For each loop
		for (Map.Entry<String, List <String>> entry: map1.entrySet()){
			System.out.println(entry.getKey()+ " " + entry.getValue());


			System.out.println("Retrieved with while loop and iterator: ");
		}
		// while loop With Iterator
		Iterator it = map1.entrySet().iterator();
		while( it.hasNext()){
			System.out.println(it.next());
		}








	}


}
