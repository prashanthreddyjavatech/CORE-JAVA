package arrays;

public class ArrayExample3 {
	// java.lang.ArrayIndexOutOfBoundsException example
	public static void main(String[] args) {
		int arr[]={10,20,30,40};  
		for(int i=0;i<=arr.length;i++){  // here array length is 3(index starts from 0) but trying to access for 4th index
		System.out.println(arr[i]);  
		}
	}

}
