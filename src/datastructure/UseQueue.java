package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		// adding to queue
		Queue<String> queue = new LinkedList<>();
		queue.add("Fariha");
		queue.add("Rafid");
		queue.add("Yazan");
		queue.add("Zayan");

		// Get Peek
		System.out.println(queue.peek());

		//Remove and get Peek
		queue.remove("Fariha");
		System.out.println(queue.peek());

		//iterate through queue using while loop
		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			//For each loop
			for (String st : queue) {
				System.out.println(st);
			}
		}


	}
}


