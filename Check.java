package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Check {

	/**
	 * @param args
	 */
	
	public static void pritFirstAndLastString(String a){
	ArrayList<String> responseList = new ArrayList<>();
	//String str[];
	for (int i = 0; i < a.length(); i++) {

	for (int j = i+1; j < a.length() + 1; j++) {
		
	System.out.println(i +"" + j);
	String temp = a.substring(i, j);
	/*if(j-i==a.length()){
		a. a.charAt(j-1);
		System.out.println();
	}*/
	System.out.println(temp); 
	responseList.add(temp);
	}
	
	}
	Collections.sort(responseList);
	
	}
	
	
	public static void main(String[] args) {
		
		//pritFirstAndLastString("abc");
		String s = "cde";
		//s.sub
		//System.out.println(s.substring(1));
		System.out.println(s.substring(0,1).toUpperCase()+ s.substring(1));
		char c[] =s.toCharArray();
		
		if(c[0]>c[1]){
			System.out.println(c[0]);
		}
}

}
