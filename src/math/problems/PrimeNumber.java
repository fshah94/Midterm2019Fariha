package math.problems;

public class PrimeNumber {
	public static void main(String[] args) {

		String primenum="";

		for(int i=2;i<=1000000; i++){

			int count =0;
			for (int j=i;j>=1;j--){
				if (i%j==0){
					count=count+1;
				}
			}
			if (count==2){
				primenum = primenum + i + " ";

			}
		}
		System.out.println("Prime Numbers for 2 to 1000 are : "+primenum);

	}

}










	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */



