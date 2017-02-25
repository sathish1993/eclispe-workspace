package HackerRank;

public class SearchCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Hi, this is a test string to check for character search";
		searchCharAndSplit(str,'x');
	}

	private static void searchCharAndSplit(String str,char toFind) {
		// TODO Auto-generated method stub
		if(str.indexOf(toFind)!=-1){
			String[] strArray = str.split(Character.toString(toFind));
			for(String strx : strArray){
				System.out.println(strx);
			}
		}else{
			System.out.println("Not Found");
		}
	}

}
