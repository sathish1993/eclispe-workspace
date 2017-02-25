package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class abc {

	static int abc(int x[],int y[]){
		int value = 0;
		List<Integer> l1 = new ArrayList<Integer>();
		if(x.length<y.length){
		for (int i =0;i<x.length;i++) {
			l1.add(x[i]);
		}
		for(int j=0;j<y.length;j++){
			if(!l1.contains(y[j])){
				value = y[j];
			}
		}
		}
		else{
			for (int i =0;i<y.length;i++) {
				l1.add(y[i]);
			}
			for(int j=0;j<x.length;j++){
				if(!l1.contains(x[j])){
					value = x[j];
				}
			}	
		}
		return value;
	}
	//https://www.google.com/foobar/?eid=vtcbWMrEBMvHjwTr37_ABw&usg=AG3vBD2MuFG5ffIkxG1sondHDtaczgMs0g
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[5];
		x[0] =13;
		x[1] =5;
		x[2] =6;
		x[3] =2;
		x[4] =5;
		//x[5] =50;
		//x[6] =3;
		//x[7] =1;
		int y[] = new int[4];
		y[0] =5;
		y[1] =2;
		y[2] =5;
		y[3] =13;
		//y[4] =1;
		//y[5] =1;
		//y[6] =14;
		//y[7] =27;
		//y[8] =50;
		
		int r =abc(x,y);
		System.out.println("r==>"+r);
	}

}
