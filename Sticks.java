package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int least = 0,count = 0,inif=0;
    for(int arr_i=0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
    }
    /*boolean check = true;
    while(check){
    	check = false;
    for(int i=0;i<n&&i+1<n;i++){
    	if(arr[i]>arr[i+1]){
    		int temp = arr[i];
    		arr[i] = arr[i+1];
    		arr[i+1] = temp;
    		check = true;
    	}
    }	
    }*/
    Arrays.sort(arr);
    System.out.println("Sorted Array");
    for(int i=0;i<n;i++){
    	System.out.print(arr[i]);
    }
    least = arr[0];
    while(count!=1){
    count = 0;
    inif = 0;
    for(int i=0;i<n;i++){
    	if(arr[i]>0){
    		arr[i] = arr[i]-least;
    		count++;
    	}
    }
    for(int i=0;i<n;i++){
    	if(inif==0 && arr[i]>0){
    			least = arr[i];    	
    			inif = 1;
    	}
    }
    System.out.println(count);
    }
    }

}
