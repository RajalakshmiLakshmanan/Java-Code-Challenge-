package practiceCoding;

public class FindPrime {
	
	public static boolean isPrime(int num) {
		
		boolean prime= true;
		
		for (int i = 2; i <=num/2; i++) {
			if((num%i==0)) {
				prime = false;
				break;
			}
			
		}
		
		return prime;
		
	}
	

	public static void main(String[] args) {
		int num= 2;
		if(isPrime(num)) {
			System.out.println("given number is prime number");
			
		}else {
			
			System.out.println("given number is not a prime number");
		}

	}

}
