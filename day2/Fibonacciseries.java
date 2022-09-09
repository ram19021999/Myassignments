package week1.day2;

public class Fibonacciseries {
public static void main(String[] args) {
	int range = 10;
	int num1=0,num2=1;
	int sum;
	System.out.println(num1);
	System.out.println(num2);
	for (int i = 1; i <= range; i++) {
		sum = num1+num2;
		num1=num2;
		num2=sum;
		System.out.println(sum);
	}
	}
}
