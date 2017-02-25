package HackerRank;

import java.util.Scanner;

public class firstRepeatingChar {

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		String str = "abcba";
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
				if(map.get(str.charAt(i))==null){
					map.put(str.charAt(i), 1);
				}else{
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}
		}
		for (char chObj : map.keySet()) {
			if(map.get(chObj) > 1){
				System.out.println(chObj);
				break;
			}
		}
	*/
		
	/*Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int a=0;int b=0;int c=0;
	for(int i=0;i<n;i++){
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if(a == b && b==c && c==a){
			System.out.println("Equi");
		}else if(a==b || b==c || c==a){
			
		}
	}*/
		
		int n = 1;
        String input = String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sbr = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
                sbr.append(input.charAt(i));
        }
        String s = sbr.toString();double sum = 1;
        System.out.println(s.length());
       
        for(int i=0;i<s.length();i++){
        	int charAt = Character.getNumericValue(s.charAt(i));
        	double exp = charAt * (Math.pow(2,32-i));
            sum = sum + exp;
        }
        System.out.println((long)Math.abs(sum)+1);
	
	
	
	}

}
