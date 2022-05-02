package Hexaware.programs;

import java.util.Scanner;

class reverseString{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		int i=str.length()-1;
		String newStr="";
		while(i>=0){
			newStr +=str.charAt(i);
			System.out.println(newStr);
			i--;
		}
		System.out.println("Reverse String: "+ newStr);
	}
}
