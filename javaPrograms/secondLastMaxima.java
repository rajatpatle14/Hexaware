package Hexaware.programs;
//second last maxima 
import java.util.Arrays;
public class secondLastMaxima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={10,21,15,11,8};
		 Arrays.sort(arr);
		 int n=arr.length;
		 System.out.println(arr[n-2]);
	}

}
