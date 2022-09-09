package week1.day2;


public class Primenumbers {
	public static void main(String[] args) {
		int num=13;
		boolean flag = false;
	
	for (int i = 2; i <=num/2; i++) {
		if (num%i==0) {
			flag=true;
			break;
			}
		}
	if (flag!=true) {
		System.out.println("It is aPrimenumber");
	}
	
		 else {
			 System.out.println("It is a not primenumber");
			
			}
	}
	}
		

	
	
	


