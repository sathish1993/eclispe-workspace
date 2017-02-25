package HackerRank;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        List<String> list = Arrays.asList(s.split("[\\s!,?._'@]+"));
        
        if(s.length() == 0){
        	System.out.println(0);
        }else{
        	System.out.println(list.size());
        }
        
        for (String string : list) {
			System.out.println(string);
		}
        scan.close();
	}

}
