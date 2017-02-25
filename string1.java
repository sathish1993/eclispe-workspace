package HackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class string1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine().toLowerCase();
		x = x.replaceAll("\\s", "");
		char c[] = x.toCharArray();
		
		TreeSet<Character> s = new TreeSet<Character>();
		for (Character character : c) {
			s.add(character);
		}
		for (Character character : s) {
			System.out.print(character);
		}
		System.out.println(s.size());
		if(s.size() == 26){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}

}
