package practiceCoding;

public class ReverseNum {

	public static int reverse(int num) {
		
		int temp= 0;
		int rem= 0;
		while(num>0) {
			rem= num %10;
			temp= rem + (temp*10);
			num= num/10;
			
		}
		
			return temp;
			
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int num= 8945;
		System.out.println("reverse Number : "+reverse(num));

	}

}
