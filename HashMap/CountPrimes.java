
/*
 * Count the number of prime numbers less than a non-negative number, n.
 */

public class CountPrimes {
	public int countPrimes(int n) {
        boolean[] notPrimeMap = new boolean[n];
        int resultCount = 0;
        for(int i=2;i<n;i++){
        	//If the number was not set as not prime by any number less than it, it is prime
            if(notPrimeMap[i] == false) {
                resultCount++;
                //Set all multiples of the prime number as notPrime
                for(int j=2;i*j<n;j++) 
                    notPrimeMap[i*j] = true;
            }
        }
        return resultCount;
    }
	
	public static void main(String[] args) {
		CountPrimes object = new CountPrimes();
		
		//TestCase1
		System.out.println("Number of prime numbers less than 10 is "+object.countPrimes(10));
		
		//TestCase2
		System.out.println("Number of prime numbers less than 100 is "+object.countPrimes(100));
	}

}
