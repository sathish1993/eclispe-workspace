package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int count = 0;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(c[i])) {
                colors.add(c[i]);
            } else {
                pairs++;
                colors.remove(c[i]);
            }
        }

        System.out.println(pairs);
        
	}

}
