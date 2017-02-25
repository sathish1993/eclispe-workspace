package HackerRank;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dequeue {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Set<Integer> set = new HashSet<Integer>();  
        int n = in.nextInt();
        int m = in.nextInt();
        int max = -1;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size() == m){
            	if(max < set.size()){
            		max = set.size();
            	}
            	int rem = deque.removeFirst();
            	if(!deque.contains(rem)){
            		set.remove(rem);
            	}
            }
        }
        System.out.println(max);
	}

}
