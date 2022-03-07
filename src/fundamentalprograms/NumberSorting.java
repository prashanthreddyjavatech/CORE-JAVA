package fundamentalprograms;

import java.util.Scanner;

public class NumberSorting {
	public static void main(String[] args) {
		int size,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers that you want to sort");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+ "numbers now ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("Given numbers in ascendig order is");
	    for (int i = 0; i <=size - 1; i++) 
        {
            System.out.print(a[i] + ", ");
        }
		
	}

}
