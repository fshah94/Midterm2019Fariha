package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */


		try{
			FileReader fr = null;
			BufferedReader br = null;

			String theFile = "/Users/fariha/IdeaProjects/MidtermJuly2019/src/data/self-driving-car";

			fr = new FileReader(theFile);
			br = new BufferedReader(fr);
			LinkedList<String> linkedListOfWords = new LinkedList<>();
			Stack<String> stackListOfWords = new Stack<>();



			String data ="";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				//to get rid of space
				String [] words = data.split(" ");
				for (String word : words) {

					linkedListOfWords.add(word);
					stackListOfWords.push(word);

				}


			}
			//Prints every word
			System.out.println("************FILO");
			ListIterator<String> it2 = stackListOfWords.listIterator(stackListOfWords.size());
			while (it2.hasPrevious()){
				System.out.println(it2.previous());
			}



			System.out.println("*************************FIFO: ");
			Iterator it =linkedListOfWords.iterator();
			while (it.hasNext()){
				System.out.println(it.next());

			}


		}  catch (Exception e) {
			e.printStackTrace();



		}

		}







	}

