package HackerRank;

import java.util.Stack;

public class FidessaRound2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(()))";
		Stack st= new Stack();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '('){
				st.push('(');
			}else{
				if((char)st.peek() == '('){
					st.pop();
				}
				st.push(str.charAt(i));
			}
		}
		if(st.isEmpty()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
