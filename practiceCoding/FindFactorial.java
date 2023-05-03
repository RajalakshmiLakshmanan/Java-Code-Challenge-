package practiceCoding;

public class FindFactorial {

	//0, 1, 1, 2, 3, 5, 8, 13, 21,
	public static void main(String[] args) {
		int n =6;
		int sum= 0;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i < 6; i++) {
			sum =firstNum +secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}

	}

}
