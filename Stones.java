package HackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Stones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<T;i++){
			set.clear();
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			for(int j=0;j<n;j++){
				int sum = (j*a) + ((n-1-j)*b);
				set.add(sum);
			}
			for (Integer integer : set) {
				System.out.print(integer + " ");
			}
		}

		
	}

}
