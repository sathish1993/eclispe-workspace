package HackerRank;

import java.util.*;
import java.util.Map.Entry;

public class Hello {
	int x[],y[];
	public Hello(int[] nums) {
		// TODO Auto-generated constructor stub
		this.x = nums;
		this.y = nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int nums[] ={1,2,3};
		Hello obj = new Hello(nums);
		int[] param_2 = obj.shuffle();
		System.out.print(param_2[0]);System.out.print(param_2[1]);System.out.println(param_2[2]);
		int[] param_1 = obj.reset();
		System.out.print(param_1[0]);System.out.print(param_1[1]);System.out.println(param_1[2]);
		int[] param_3 = obj.reset();
		System.out.print(param_3[0]);System.out.print(param_3[1]);System.out.println(param_3[2]);
		*/
		int x=1534236469;
		int y=0;
		while(x!=0){
			y = (y * 10) + x%10;
			x = x/10;
		}
		System.out.println(y);
		
		String str = "Aabb";
		Map<Character,Integer> hmap =  new HashMap<Character,Integer>(); 
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(hmap.get(ch[i])!=null){
				hmap.put(ch[i], hmap.get(ch[i])+1);
			}else{
				hmap.put(ch[i],1);
			}
		}
		
		Set<Entry<Character,Integer>> mapentries = hmap.entrySet();
		List<Entry<Character,Integer>> list = new LinkedList<Entry<Character,Integer>>(mapentries);
		
		Collections.sort(list, new Comparator<Entry<Character,Integer>>() {
			@Override
			public int compare(Entry<Character,Integer> ele1, Entry<Character,Integer> ele2){
				return ele2.getValue().compareTo(ele1.getValue());
			}
		});
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(Entry<Character,Integer> e:list){
			map.put(e.getKey(),e.getValue());
		}
		
		StringBuilder sbr = new StringBuilder();
		for(Entry<Character,Integer> e:map.entrySet()){
			for(int df=e.getValue();df>0;df--){
				sbr.append(e.getKey());
			}
		}
		
		System.out.println(sbr.toString());
		
	}

	private int[] shuffle() {
		// TODO Auto-generated method stub
		List l1 = Arrays.asList(x);
		Collections.shuffle(l1);
		Object obj[] = l1.toArray();
		Integer c[] = null;
		for(int i=0;i<obj.length && i+1<obj.length;i++){
			c[i] = (Integer)obj[i];
		}
		for(int i=0;i<c.length && i+1<c.length;i++){
			x[i] = c[i].intValue();
		}
		return x;
	}

	private int[] reset() {
		// TODO Auto-generated method stub
		x = y;
		
		return x;
	}

}
