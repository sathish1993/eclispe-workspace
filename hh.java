package HackerRank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
public class hh {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Email = " E : a11   *_ @gmail.com";
		 Email = Email.replaceAll("[\\s]","");
		//boolean isAscii = CharMatcher.ASCII.matchesAllOf(someString);
		/*if(Email.charAt(2)=='.'){
		System.out.println("asdasasf");	
		}*/
		 System.out.println(Email);
		 if(Email.contains("*+-/=?^_`{|}~")){
	//if(Email.contains(".!#$%&'*+-/=?^_`{|}~")){
		 //if(Email.matches("[A-Za-z0-9!#$%&'*.+-/=?^`{|}~]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")){
		String NewEmail = Email.replaceAll("(?<=.{3}).(?=[^@]*?.@)", "*");
		System.out.println(NewEmail);
		NewEmail = NewEmail.replaceAll("([\\*]+)", "*****");
		System.out.println(NewEmail);
		}else{
		System.out.println("NIl");}
	/*String a= "ab"; String b = "zsd";
	int lena = a.length();
	int lenb = b.length();
	int min = lenb;
	if(lena < lenb){
		 min = lena;
	}
	StringBuffer strbuf = new StringBuffer();
	for(int i=0;i < min;i++){
		 strbuf.append(a.charAt(i));
		 strbuf.append(b.charAt(i));
	}
	if(lena < lenb){
		strbuf.append(b.substring(min));
	}else{
		strbuf.append(a.substring(min));
	}
	return strbuf.toString();*/	
	
	
	
	
	
	
	
	
	}

}
