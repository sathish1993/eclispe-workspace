package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class leetcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[1][2];
		/*a[0][0] = 0;a[0][1] = 1;a[0][2] = 0;a[0][3] = 0;
		a[1][0] = 1;a[1][1] = 1;a[1][2] = 1;a[1][3] = 0;
		a[2][0] = 0;a[2][1] = 1;a[2][2] = 0;a[2][3] = 0;
		a[3][0] = 1;a[3][1] = 1;a[3][2] = 0;a[3][3] = 0;*/
		a[0][0] = 1;
		a[0][1] = 0;
		//int ex = hey(a);
		//System.out.println(ex);//4 3 2 7 8 2 3 1
		int nums[] = new int[8];
		Scanner sc = new Scanner(System.in);
		for(int k=0;k<8;k++){
			nums[k] = sc.nextInt();
		}
		List<Integer> l = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++ ) {
			map.put(nums[i], nums[i]);
		}
		for (int i=0;i<nums.length;i++ ) {
			if(map.get(i+1) == null){
				l.add(new Integer(i+1));
			}
		}
        System.out.println(l);
		
		
		
		
		
	}

	private static int hey(int[][] grid) {
        int perimeter = 0;
        int x = grid.length;
		for(int i =0;i<grid.length;i++){
			for(int j =0;j<grid[i].length;j++){
				System.out.println("i==>"+i+"j==>"+j);
				if(grid[i][j] == 1){
					perimeter = perimeter + 4;
					if(i+1<grid.length && j<grid[i].length && grid[i+1][j] == 1){
						perimeter--;
					}
					if(i-1>=0 && j<grid[i].length && grid[i-1][j] == 1){
						perimeter--;
					}
					if(i<grid.length && j+1<grid[i].length && grid[i][j+1] == 1){
						perimeter--;
					}
					if(i<grid.length && j-1>=0 && grid[i][j-1] == 1){
						perimeter--;
					}
				}
				System.out.println("perimter==>"+perimeter);
			}
		}
	    return perimeter;	
    }

}
