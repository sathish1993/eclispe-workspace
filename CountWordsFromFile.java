package HackerRank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordsFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fisObj = new FileInputStream("check.txt");
		if(fisObj!=null){
			Scanner sc = new Scanner(fisObj);
			while(sc.hasNext()){
				String x = sc.next();
				System.out.println(x + "====>Character Count  " + x.length());
			}
		}
	}

}
