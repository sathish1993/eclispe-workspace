package HackerRank;

import java.util.Scanner;

public class append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int app = 0;int del =0;
        if(s.length() > t.length()){
        	del = (k/2) + 1;
        	app = k-del;
        }else{
        	app = (k/2) + 1;
        	del = k-app;
        }
        for(int i=0;i<del;i++){
        	if(s.length() > 0){
        		s = s.substring(0,s.length()-1);
        	}
        }
        char c[] = t.toCharArray();
        for(int i=app;i>0;i--){
        	s = s + c[c.length-i];
        }
        if(s.equals(t)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}

}
