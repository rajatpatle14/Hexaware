package Hexaware.programs;
//maximum aary
public class minimumInArray {

	public static void main(String[] args) {
		int arr[]={1,2,5,4,3};
	    int min=arr[0];
	    for (int i=1;i<5 ;i++ ) {
	      if (min>arr[i]) {
	        min=arr[i];
	      }

	    }
	    System.out.println("Minimum in array is: "+min);
		
	}

}
