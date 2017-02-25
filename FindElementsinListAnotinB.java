package HackerRank;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FindElementsinListAnotinB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = new CopyOnWriteArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		List<Integer> listC = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
				listA.add(i);
		}
		for(int i=6;i<10;i++){
				listB.add(i);
		}
		
		for (Integer integer : listA) {
			if(listB.contains(integer)){
				listA.remove(integer);
				//listC.add(integer);
			}
		}
		
		for (Integer integer : listA) {
			System.out.println(integer);
		}
		
	}

}
