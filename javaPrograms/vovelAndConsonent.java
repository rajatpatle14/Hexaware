package Hexaware.programs;
//vovel and consonent
public class vovelAndConsonent {

	public static void main(String[] args) {
		 String s="abcdefstrijklmnopqrst";
		 int n=s.length();
		 String str=s.toLowerCase();
		 System.out.println(str);
		 for (int i=0;i<n ;i++ ) {
			 if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
				 str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				 System.out.printf("[%d] alphabet is vowel",i);
				 System.out.println();
		    }
		 }
		 for (int i=0;i<n ;i++ ) {
			 if (str.charAt(i)!='a' || str.charAt(i)!='e' || str.charAt(i)!='i' ||
		       str.charAt(i)!='o' ||str.charAt(i)!='u' ) {
				 System.out.printf("[%d] alphabet is consonent",i);
		    		System.out.println();
		      }
		 }

	}
}
