package practiceCoding;





public class MatrixAddition {
	
	public static  void rowSum(int rowsize,int colsize,int[][]num) {
		
		
		for(int i=0;i<rowsize;i++) {
		 int sum= 0;
			
			for (int j = 0; j < colsize; j++) {
				
				sum= sum + num[i][j];
				
			}
			System.out.println((i+1)+"st row sum : "+sum);
			
		}	
		
	}

	public static void colSum(int rowsize,int colsize,int[][]num) {
		
		for(int i=0;i<colsize;i++) {
			
			int sum= 0;
			for(int j=0;j<rowsize;j++) {
				
				sum= sum + num[j][i]; 
						
				
			}
			System.out.println((i+1) +"st column sum: "+sum);
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[][] num= {{2,3,5,6},{8,9,10,11},{3,7,5,8}};
		
		int rowsize = num.length;
		
		int colsize = num[0].length;
		
		rowSum(rowsize,colsize,num);
		colSum(rowsize,colsize,num);
		
		
			      
		}

	}


