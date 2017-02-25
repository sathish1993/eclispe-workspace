package HackerRank;

public class Insertionsort {

	/**
	 * @param args
	 * @return 
	 */
	
	static void insertion(int arr[]){
		int key,j=0;
		for(int i =1;i<arr.length;i++){
			key = arr[i];
			j = i-1;
			while(j>=0 && key < arr[j]){
				arr[j+1] = arr[j]; 
				j--;		
			}
			arr[j+1] = key;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8};
		insertion(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
