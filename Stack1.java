package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "chillout";
        List<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        int len = s.length();
        //System.out.println("length "+ len);
        char c1[] = s.toCharArray();
        double nearstIntRow = Math.sqrt(len);
        double columnsFloat = len/nearstIntRow;
        int columns = (int)Math.ceil(columnsFloat);
        int rows = (int)Math.ceil(nearstIntRow);
        //System.out.println("Rows " + rows);
        //System.out.println("Coumns " + columns);
        //System.out.println("Area" + nearstIntRow*columns);
        int m = 0;
        String x = "";
        for(int i=0;i<rows;i++){
        	if(m<=len){
	        	if(m+columns <= len){
	        		x = s.substring(m, m+columns);
	        	}else{
	        		x = s.substring(m, len);
	        	}
	        	//	System.out.println(x);
	        	list.add(x);
	        	m = m + columns;
        	}
        }
        for(int i=0;i<columns;i++){
        	String myString = "";
        	for (String str : list) {
        		if( i < str.length()){
        			myString = myString + str.charAt(i);
        		}
        	}
        	//System.out.println(myString);
	        list1.add(myString);
        }
        
        for (String str : list1) {
			System.out.print(str+ " ");
		}
	}
	
}
