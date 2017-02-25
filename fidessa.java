 package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class fidessa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 122314;
		Set<Character> set = new HashSet<Character>();
		/*while(n%10>0){
			set.add(n%10);
			n=n/10;
		}
		System.out.println(set);*/
		String str = "abca";
		for(int i=0;i<str.length();i++){
			if(set.size() > 0 && set.contains(str.charAt(i))){
				System.out.println(str.charAt(i));
			}else{
				set.add(str.charAt(i));
			}
		}
		
		int x = (int) 'c';
		int y = (int) 'd';
		System.out.println(x-y);
		
		String str1 = "asdasd";
		System.out.println(str1.indexOf('s'));
		
		
	}

}
