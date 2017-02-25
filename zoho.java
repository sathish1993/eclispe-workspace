package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zoho {

	public static void main(String[] args) {
		String str = "b03c6d15";
		//que1(str);
		int arr[] = new int[9];
		for(int i=0;i<9;i++){
			arr[i] = i+1;
		}
		//arr[0] = 13;arr[1] = 2;arr[2] = 4;arr[3] = 15;arr[4] = 12;arr[5] = 10;arr[6] = 5;
		//que2(arr);
		int arr1[] = new int[8];
		int arr2[] = new int[10];
		arr1[0] = 2;arr1[1] = 4;arr1[2] = 5;arr1[3] = 6;arr1[4] = 7;arr1[5] = 9;arr1[6] = 10;arr1[7]=13;
		arr2[0] = 2;arr2[1] = 3;arr2[2] = 4;arr2[3] = 5;arr2[4] = 6;arr2[5] = 7;arr2[6] = 8;arr2[7]=9;arr2[8]=11;arr2[9]=15;
		//que3(arr1,arr2);
		
		String s1 = "test123string";
		String s2 = "123";
		//que4(s1,s2);
		
		String str1 = "geeksforgeeks";
		//que5(str1);
		
		String str2 = "one two three";
		String stra[] = str2.split("\\s");
		System.out.println(que6(stra));
	}

	private static String que6(String[] stra) {
		return rev(stra,0,stra.length-1);
	}

	private static String rev(String[] stra, int i, int j) {
		if(i >= j) return Arrays.toString(stra);
		String temp = stra[i];
		stra[i] = stra[j];
		stra[j] = temp;
		return rev(stra,i+1,j-1);
	}

	private static void que5(String str1) {
		char c[] = str1.toCharArray();
		for(int m=0;m<str1.length();m++){
			int i=0;
			while(i<str1.length()){
				if(i==m || i==str1.length()-1-m){
					System.out.print(str1.charAt(i));
				}else{
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
		}
	}

	private static void que4(String s1, String s2) {
		System.out.println(s1.indexOf(s2));
	}

	private static void que3(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++){
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++){
			set.add(arr2[i]);
		}
		System.out.println(set);
	}

	private static void que2(int[] arr) {
		List<Integer> ol = new ArrayList<Integer>();
		List<Integer> el = new ArrayList<Integer>();
		List<Integer> fl = new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0){
				el.add(new Integer(arr[i]));
			}else{
				ol.add(new Integer(arr[i]));
			}
		}
		System.out.println(el);
		System.out.println(ol);
		Collections.reverse(ol);
		for(int i=0;i<9;i++){
			if(i<=ol.size()-1 && ol.get(i)!=null){
				fl.add(ol.get(i));
			}
			if(i<=el.size()-1 && el.get(i)!=null){
				fl.add(el.get(i));
			}
			if(i >= ol.size() && i >= el.size()){
				System.out.println(fl);
				System.exit(0);
			}
		}
		
	}

	private static void que1(String str) {
		char c = '\0';
		int i = 0;
		while(i<str.length()){	
			if(Character.isAlphabetic(str.charAt(i))){
				c = str.charAt(i);
				i++;
				continue;
			}else{
				char ch = str.charAt(i);
				String s = null;
				int max = 0;
				if(str.charAt(i+1)!='\0' && !Character.isAlphabetic(str.charAt(i+1))){
					s = new StringBuilder().append(ch).append(str.charAt(i+1)).toString();
					max = Integer.parseInt(s);
					i = i+2;
				}
				if(s == null){
					max = Character.getNumericValue(ch);
					i++;
				}
				for(int k=0;k<max;k++){
					System.out.print(c);
				}
			}
		}
		
	
	}

}
