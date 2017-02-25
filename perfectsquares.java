package HackerRank;

import java.util.Scanner;

public class perfectsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		for(int i=0;i<n;i++){
			int count = 0;
			int a = in.nextInt();
			int b = in.nextInt();
			count =  (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
			System.out.println(count);
		}
	}

}
