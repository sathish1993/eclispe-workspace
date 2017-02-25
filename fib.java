package HackerRank;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		int k = 5;
		int a[] = new int[5];
		for(int i=1;i<6;i++){
			a[i-1] = i;
		}
		int j =0;
		while(j <5){
			for(int i=0;i<5;i++){
				//System.out.println(" j "+ j + " i "+i);
				if(a[i]+a[j] ==k){
					System.out.println("yes");
				}
			}
			j++;
		}
		
		int x=3,y=4;
		float z = ((x^(1/3)) + (y^(1/3)))^3;
		System.out.println("z value is "+ z);
		if(z%1==0){
			System.out.println("int it is");
		}
		//int x = fib.fibo(num);
		
		String str = ")(";
		char c[] = str.toCharArray();
		int count = 0;boolean dfg = false;
		for (char ch : c) {
			if(ch == '(' && dfg == false){
				count++;
				dfg = true;
			}else if(ch ==')' && dfg == true ){
				count++;
			}
			
		}
		if(count == 2){
			System.out.println("perfect");
		}else{
			System.out.println("Naah");
		}
		String strArray[] = new String[5];
		Map<Integer,String[]> hm = new HashMap<Integer,String[]>();
		strArray[0] = "abv";
		strArray[1] = "dfg";
		hm.put(1, strArray);
		//hm.put(1, 20);
		for (String string : hm.get(1)) {
			System.out.println("hm.get(1)  "+ string);
		}
		
		
	*/
		
		Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        String strArray[] = new String[n];
        for(int i = 0;i < n;i++){
            strArray[i] = in.next();
        }
        int q = in.nextInt();
        String strArray2[] = new String[q];
        for(int i = 0;i < q;i++){
            strArray2[i] = in.next();
        }
        for(int i =0;i<q;i++){
        	int c = 0;
        	for(int j=0;j<n;j++){
            	//System.out.println("strArray2[i] "+ strArray2[i] + " strArray[j] " + strArray[j]);
                if(strArray2[i].equalsIgnoreCase(strArray[j])){
                	c++;
                }
            }
            System.out.println(c);
        }
      }

	static int fibo(int n) {
		// TODO Auto-generated method stu
		if (n <= 1){
		      return n;
		}else{
			//ystem.out.println(fibo(n-1) + fibo(n-2));
			return fibo(n-1) + fibo(n-2);
		}
		
	}

}
