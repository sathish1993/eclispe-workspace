package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class djava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      while (sc.hasNext()) {
	         String txt=sc.next();
	         boolean aval = false;boolean bval = false;boolean cval = false;boolean check= false;
	         char c[] = txt.toCharArray();
	         int ac=0;int bc=0;int cc=0;
	         for(char input : c){
	        	 if(input =='{'){
	        		 ac++;
	        	 }
	        	 if(input == '}'){
	        		ac--; 
	        	 }
	        	 if(input =='('){
	        		 bc++;
	        	 }
	        	 if(input == ')'){
	        		bc--; 
	        	 }if(input =='['){
	        		 cc++;
	        	 }
	        	 if(input == ']'){
	        		cc--; 
	        	 }
	         }
	         if(ac!=0 || bc!=0 || cc!=0){
	        	 System.out.println("false");
	        	 check = false;
	         }else{
	        	 check = true;
	         }
	         if(check){
			         for(char input : c){
				          if(input =='{'){   
				        	  aval = true;
				          }
				          if(aval && input == '}'){
				        	  aval = false;
				          }
				          if(input == '('){   
				        	  bval = true;
				          }
				          if(bval && input == ')'){
				        	  bval = false;
				          }
				          if(input == '['){   
				        	  cval = true;
				          }
				          if(cval && input == ']'){
				        	  cval = false;
				          }
			         }
			          if(!aval && !bval && !cval){
				    	  System.out.println("true");
				      }else{
				    	  System.out.println("false");
				      }
	         }
	      }
	      
		
	}

}
