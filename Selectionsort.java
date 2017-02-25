package HackerRank;

public class Selectionsort {

	/**
	 * @param args
	 */
	static void selection(int arr[]){
		int min = arr[0];
		for(int i =0;(i< arr.length)&&(i+1<arr.length);i++){
			if(min > arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			min = arr[i+1];
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8,16,97,24,67};
		selection(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	
	
	}

}
