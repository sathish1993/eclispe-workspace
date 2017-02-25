package HackerRank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllPhoneNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("check.txt");
		Scanner sc = new Scanner(fis);
		Map<Integer,String> map = new HashMap<Integer,String>();
		int count = 0;
		while(sc.hasNext()){
			map.put(count, sc.next());
			count++;
		}
		for (int i : map.keySet()) {
			try{
				if(map.get(i).length() > 9){
					long phoneNumber = Long.parseLong(map.get(i));
					System.out.println(phoneNumber);
				}
			}catch(Exception e){
			}
		}	
	}

}
