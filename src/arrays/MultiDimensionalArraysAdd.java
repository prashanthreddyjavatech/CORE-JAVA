package arrays;

public class MultiDimensionalArraysAdd {
	public static void main(String[] args) {
		
		//creating two matrices  
		int a[][]={{1,2,3},{4,5,6}};  
		int b[][]={{1,2,3},{4,5,6}};  
		
		//creating new matrix to store the sum of two matrices a and b  
		int c[][]=new int[2][3];  // 2 rows,3 columns
		  
		//adding and printing addition of 2 matrices  
		for(int i=0;i<2;i++){  
			for(int j=0;j<3;j++){  
				c[i][j]=a[i][j]+b[i][j];  
				System.out.print(c[i][j]+" ");  
				}  
			System.out.println();//new line  
		}
	}

}
