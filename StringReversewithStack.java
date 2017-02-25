package HackerRank;

public class StringReversewithStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		stringReverse(str);
	}

	private static void stringReverse(String str) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();
		StackObj stack = new StackObj(ch.length);
		for(int i=0;i<ch.length;i++){
			stack.push(ch[i]);
		}
		System.out.println("Reversed String is:");
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(stack.pop());
		}
	}

}
