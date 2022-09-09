package week1.day2;

import java.util.Arrays;

public class MissingelementinArray {
	public static void main(String[] args) {
		int[] ays= {1,2,3,5,6,7,8};
		Arrays.sort(ays);
		for (int i = 0; i < ays.length; i++) {
			if (ays[i]+1 != ays[i+1]) {
				System.out.println(ays[i]+1);
				break;
				}
			
		}
		
	}

}
