package HackerRank;

import java.util.Stack;

public class StackToMatchPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCabc";
		Stack st = new Stack();
		int index = -1;
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				st.push((char)str.charAt(i));
			}else{
				if(!st.isEmpty() && (char)st.peek() == Character.toUpperCase(str.charAt(i))){
					index = i;
					st.pop();
				}else{
					break;
				}
			}
		}
		System.out.println(index);
	}

}
