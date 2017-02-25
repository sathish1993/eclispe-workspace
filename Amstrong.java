package HackerRank;

import java.util.Arrays;

public class Amstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int sum = 0;
		int rem = 0;
		while(n!=0){
			rem = n%10;
			n = n/10;
			sum = sum +(int)Math.pow(rem,3);
		}
		System.out.println("sum"+sum);
	}
}
