package HackerRank;

public class StackObj {
	char ch[] = null;
	int top = -1;
	public StackObj(int size){
		ch = new char[size];
	}
	void push(char c){
		ch[top+1] = c;
		top = top+1;
	}
	char pop(){
		char c = ch[top];
		top = top-1;
		return c;
	}
}
