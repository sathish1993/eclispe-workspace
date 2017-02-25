package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Subset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        	arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if((arr[i]%k+arr[j]%k)==k){
        			count++;
        		}
        	}
        }
        */
        /*int s = arr[0];
        int i=0;
        while(i<n && i+1<n){
        	//s = s+arr[i];
        	if(s + arr[i+1]%k!=0){
        		count++;
        	}
        i++;	
        }*/
        //System.out.println(count);
		Scanner in = new Scanner(System.in);
	    String s = in.next();
	    System.out.println(s.replace("a",""));
	    int no_of_a = s.length()-s.replace("a","").length();
	    long n = in.nextLong();
	    long d = n/(s.length());
	    long m = n%(s.length());
	    if(m==0)
	      {
	         System.out.println(no_of_a*d);
	      }
	    else
	      {
	          int how_many_a_in_m=s.substring(0,(int)m).length()-s.substring(0,    (int)m).replace("a","").length();
	           //System.out.println(how_many_a_in_m);
	           System.out.println(no_of_a*d+(how_many_a_in_m));

	      }
	}
}
