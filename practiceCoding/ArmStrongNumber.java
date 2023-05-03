package practiceCoding;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int num= input;
		int temp = 0;
		int rem= 0;
		while(num>0) {
			rem =num %10;
			temp = temp + (rem *rem *rem);
			num= num/10;
				
		}
    if(temp==input) {
    	System.out.println("given number is Armstrong number");
    	
    }else {
    	
    	System.out.println("not a Armstrong number");
    }
	}

}
