package HackerRank;

import java.util.HashMap;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class zappos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a test madam for testing";
		String str1 = "test";
		String strx = "ACCcBb";
		//String strResult = problem2(str,str1);
		//System.out.println(strResult);
		//problem3(strx);
		int arr[] = {1,2,3};
		int weightarray[] = {10,20,30};
		int maxWeight = 30;
		//int x = problem4(arr);
		//System.out.println(x);
		//problem5(str);
		//recusrionSearch(arr,100,0);
		//int maxElements = knacksack(arr,weightarray,maxWeight,);
		//System.out.println(maxElements);
		System.out.println(stringReverse(str1));
	}
	
	private static String stringReverse(String str1) {

		if(str1 == null || str1.length() <= 1){
			return str1;
		}
		return stringReverse(str1.substring(1)) + str1.charAt(0);
		
	}

	private static int knacksack(int[] arr, int[] weightarray, int maxWeight,int sumOfWeights) {
		// TODO Auto-generated method stub
		//sumOfWeights = sumOfWeights + weightarray[index];
		if(sumOfWeights <= maxWeight){
			//knacksack(arr, weightarray, maxWeight, index+1, sumOfWeights);
		}
		return sumOfWeights;
	}

	private static void recusrionSearch(int arr[], int toFind,int i) {
		if(arr[i] == toFind){
			System.out.println("index "+ i);
		}else{
			recusrionSearch(arr, toFind, i+1);
		}
		
	}

	private static void problem5(String str) {
		// TODO Auto-generated method stub
		String strArr[] = str.split(" ");
		for(int i=0;i<strArr.length;i++){
			StringBuilder br = new StringBuilder(strArr[i]);
			if(strArr[i].equalsIgnoreCase(br.reverse().toString())){
				System.out.println("Sub String Palindrome " + strArr[i]);
			}
		}
			
	}

	private static int problem4(int[] nums) {
		// TODO Auto-generated method stub

	     int i =0;
	     int size = nums.length;
	     while(i<size && i+1<=size){
	         if(nums[i] == nums[i+1]){
	                for(int j = i+1;j<=size && j+1<=size;j++){
	                    nums[j] = nums[j+1];
	                } 
	                nums[size-1] = 0;
	                size--;
	         }
	         i++;
	     }
	     return size;
	}

	private static String problem2(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0;String result = null;
		while(i<s1.length()){
			String subString = s1.substring(i,s2.length()+i);
			if(s2.equals(subString)){
				result = s1.substring(i);
				break;
			}else{
				i++;
			}
		}
		return result;
	}
	
	private static void problem3(String s2) {
		// TODO Auto-generated method stub
		int count = 0;
		StringBuilder s1 = new StringBuilder(s2);
		for(int i=0;i<s1.length();i++){
			if((Character.isUpperCase(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i+1)))){
				count++;
			}else if(Character.isUpperCase(s1.charAt(i)) && Character.isLowerCase(s1.charAt(i+1)) && Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s1.charAt(i+1))){ 
				count++;
				s1.replace(i,i+2, "");
				System.out.println(s1);
				i=-1;
			}
		}
		System.out.println(count);
	}

	private static void problem1(int a[],int b[],int n) {
		// TODO Auto-generated method stub
		int c = 1;int max = 1;
		int i=0,j=0;
		while(i<n && j<n){
			if(a[i] <= b[j]){
				c++;
				i++;
				if(max < c){
					max = c;
				}
			}else{
				c--;
				j++;
			}
				
		}
		System.out.println(max);
	}

}
