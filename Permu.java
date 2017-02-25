package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String strarr[] = new String[n];
		for(int i=0;i<n;i++){
			strarr[i] = in.next();
		}
		List<String> l1 = new ArrayList<String>();
		for (String string : strarr) {
			char c[] = string.toCharArray();
			Arrays.sort(c);
			if(string.charAt(string.length()-1) == string.charAt(string.length()-2)){
				System.out.println("no answer");
				continue;
			}
			for(int j=0;j<c.length-1;j++){
				char temp = c[0];
				for(int i=0;i<c.length-1;i++){
					c[i] = c[i+1];
				}
				c[c.length-1] = temp;
				String newStr = new String(c);
				l1.add(newStr);
			}
			System.out.println("Permuataiion of string");
			for (String s : l1) {
				System.out.println(s);
			}
		}
	}

}
