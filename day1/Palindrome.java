package week3.day1;

public class Palindrome {
	
	public static void main(String[] args) {
		
	String name="MADAM";
	
	String rev="";
	
	for (int i = args.length-1; i >= 0; i--) {
		
		rev=rev+name.charAt(i);
		
	}
	
	if (name.equals(rev)) {
		
		System.out.println("palindrome");
		
	} else {
		
		System.out.println("Not a palindrome");
		
	}

}
	
}
