package HackerRank;
import java.util.*;
public class Code2 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a = new long[32];
		//a[0]=1;a[1]=2;a[2]=3;
		int n=-1, quo=0,rem=0;
		long newNum = 0;
		//quo = n/2;
		//rem = n%2;
		int dec = 0;
		int i = 0;
		if(n>0){
		  for(i = 31; i >=0; i--){
		  //a[i] = (i>>n)&1;
		  a[i] = n%2;
		  n=n/2;
		  }
		}
		 if(n<0){
			 //n=-n;
			newNum = (long)Math.pow(2,32) + n; 
			System.out.print((newNum % 2) + "\n");
			for(i = 31; i >=0; i--){
				  //a[i] = (i>>n)&1;
				  a[i] = newNum%2;
				  newNum=newNum/2;
				  }
		 }
		
		for(int k =0;k<=31;k++) 
		System.out.print(a[k]);   
		System.out.print("\n");
		System.out.println((int)Math.pow(2,32));
}
}
