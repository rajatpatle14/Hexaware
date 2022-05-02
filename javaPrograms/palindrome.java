package Hexaware.programs;
//palindrome
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int t =n; 
		int p=0;
		while(t>0) {
			p =(p*10)+(t%10);
			t /=10;
		}
		if(p==n) System.out.println("Number is Palindrome");
		else System.out.println("Not a palindrome");
	}
}
