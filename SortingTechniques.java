package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,1};
		String str = "a.b.,";
		int k = 30;
		//doInsertionSort(arr);
		//doReverseVowel(str);
		//doPascals(k);
		//System.out.println(findThirdMax(arr));
		findTotalPrimes(k);
	}

	private static void findTotalPrimes(int n) {
		// TODO Auto-generated method stub

        List<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<n;i++){
        	boolean bool = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                list.add(i);
            }
        }
        System.out.println(list.size());
	}

	private static int findThirdMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		Arrays.sort(nums);
		return nums[nums.length - 3];
		
	}

	private static void doPascals(int r) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=r;i++){
        	list.add(0,1);
        	for(int j=1;j<list.size()-1;j++){
        		list.set(j, list.get(j)+list.get(j+1));
        	}
        }
        System.out.println(list);
        //return list;
    }

	private static void doReverseVowel(String s) {
        int i = 0;int j= s.length()-1;
        Set<Character> set = new HashSet<Character>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        StringBuilder sbr = new StringBuilder(s);
        while(i<j){
        		while(i<j && !set.contains(s.charAt(i))){
        			i++;
        		}
        		while(i<j && !set.contains(s.charAt(j))){
        			j--;
        		}
            	char temp = sbr.charAt(i);
                sbr.setCharAt(i,sbr.charAt(j));
                sbr.setCharAt(j,temp);
            System.out.println(sbr);
            i++;j--;
        }
        
	}

	private static void doInsertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++){
			int key = arr[i];
			int k = i-1;
			for(;k>=0 && k-1>=0 && arr[k] > key;k--){
				arr[k+1] = arr[k];
			}
			arr[k+1] = key;
		}
		
		
		System.out.println("Array Insertion Sort");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

}
