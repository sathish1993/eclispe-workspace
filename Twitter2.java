package HackerRank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Twitter2 {

	/**
	 * @param args
	 */
	static int maxLength(int[] a, int k) {
	    PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
			for(int item: a){
				heap.add(item);
			}	
			int sum = 0;
			int count = 0;
			while(sum <= k && !heap.isEmpty()){
				int item = heap.poll();	
				if(sum + item <= k){
					sum = sum + item;
					count++;
				}
				else{
					break;			
				}
			}
			return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Length: ");
		int len = in.nextInt();
		int[] a = new int[len];
		for(int i = 0; i<len; i++){
			a[i] = in.nextInt();
		}
		System.out.println("Max sum: ");
		System.out.println(maxLength(a,in.nextInt()));
	}

}
