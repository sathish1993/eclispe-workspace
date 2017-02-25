package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int diff = hey(1,4);
				//System.out.println(diff);
		//doComplement(5);
		int[] arr = new int[7];
		arr[0] = 1;arr[1] = 1;arr[2] = 0;arr[3] = 1;arr[4] = 1;
		arr[5] = 1;arr[6] = 1;
		//maxOnes(arr);
		climbStairs(5);
	}

	private static void climbStairs(int n) {
		int count = 1,x=1;
		int arr[] = new int[n];
		Arrays.fill(arr, 1);
		while(x<n){
			for(int i=0;i<x;i++){
				
			}
			x=x+2;
		}
	}

	private static void maxOnes(int nums[]) {
		int finCount=0,max=0;
		for(int i=0;i<nums.length;i++){
	         if(nums[i]==1){
	             finCount++;
	             if(max < finCount){
	            	 max = finCount;
	             }
	         }else{
	        	 finCount=0;
	         }
	     }
		System.out.println(max);
	}

	private static void doComplement(int i) {
		// TODO Auto-generated method stub
		String str = Integer.toBinaryString(i);
		System.out.println("intialbinary-->" + str);
		StringBuilder newStr = new StringBuilder();
		for(int x=0;x<str.length();x++){
			if(str.charAt(x) == '1'){
				newStr.append(0);
			}else{
				newStr.append(1);
			}
		}
		int sum=0,count=0;
		System.out.println("finalbinary-->" + newStr);
		for(int c=str.length()-1;c>0;c--){
			sum = (int) (sum + (Character.getNumericValue(newStr.charAt(c)))*Math.pow(2, count));
			count++;
		}
		System.out.println(sum);
	}

	private static int hey(int x, int y) {
		String d1 = "hello";
		char c[] = d1.toCharArray();
		char s[] = new char[d1.length()];
		int i = d1.length()-1;
        for(int j=c.length-1;j>=0;j--){
                s[i-j] = c[j];
        }
        System.out.println(s);
		System.out.println(new StringBuilder(d1).reverse().toString());	
		return 1;
	}
	
	

}
