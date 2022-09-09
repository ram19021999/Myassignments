package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num = 34343,rk;
		int temp =num;
		int sum =0;
		while(num>0) {
			rk=num%10;                                      
			sum = (sum*10)+rk;
			num = num/10;
		}
		if (sum==temp) {
			System.out.println("Palindrome Number");
			}
		else 
			System.out.println("Not Palindrome Number");
		}
			
}





