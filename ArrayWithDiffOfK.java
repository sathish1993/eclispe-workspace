package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayWithDiffOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int k =3;
		diffOfK(arr,k);
		diffOfKWithSet(arr,k);
	}

	private static void diffOfKWithSet(int[] arr, int k) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i] - k)){
				count++;
			}
		}
		System.out.println(count);
	}

	private static void diffOfK(int[] arr, int k) {
		// TODO Auto-generated method stub
		List<int[]> list = new ArrayList<int[]>();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int[] diffArr = new int[2]; 
				if(Math.abs(arr[i]-arr[j]) == k){
					diffArr[0] = i;diffArr[1] = j;
					list.add(diffArr);
				}
			}
		}
		for (int[] is : list) {
			for(int i=0;i<is.length;i++){
				System.out.print(is[i]+"\t");
			}
			System.out.println();
		}
		
	}

}
