package HackerRank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new SC();
		SC sc = new SC();
		c.f(sc.f(sc));
		sc.f(c.f(sc));
	}

}
