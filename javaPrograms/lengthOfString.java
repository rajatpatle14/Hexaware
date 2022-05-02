package Hexaware.programs;
//length of string
public class lengthOfString {

	public static void main(String[] args) {
		 String s="Happy";
		 char[] c=s.toCharArray();
		 int count=0;
		 for(char ch: c){
		     count++;
		 }
		 System.out.println(count);

	}
}
