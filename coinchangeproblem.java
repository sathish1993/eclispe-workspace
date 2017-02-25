package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class coinchangeproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = 5;
        //int k = sc.nextInt();
        int c[] = new int[n];
        //for(int i=0;i<n;i++){
          //  c[i] = sc.nextInt();
        //}
        //antenna(n,c,k);
        //System.out.println(okay(c,n,m));
        //doublecheck(c);
        int g =1234;int h=4;
        /*while(h!=0){
        	int x = g&h;
        	g = g^h;
        	h = x<<1;
        }*/
        
        int d = g==0?0:(g%9==0?9:(g%9));;
        //System.out.println(d);
        String v1 = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
        String v2 = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
        ///String v1 ="abcde"; String v2 = "abcd";
        int x =0;int y=0;
        for(int i=0;i<v1.length();i++){
        	x = x + (int)v1.charAt(i);
        }
        for(int i=0;i<v2.length();i++){
        	y = y + (int)v2.charAt(i);
        }
        System.out.println((char)((int)Math.abs(x-y)));
        //<Character> t12 = new ArrayList<Character>(ts1);
        //List<Character> t22 = new ArrayList<Character>(ts1);
        //t12.addAll(ts1);
        //t22.retainAll(ts2);
        //ts1.retainAll(ts2);
        
        
	}
	

	private static void doublecheck(int[] c) {
		int x = 0;
		for(int i=0;i<c.length;i++){
			x ^= c[i];
			System.out.println(x);
		}
		
	}


	private static void antenna(int n,int[] c, int k) {
		int houseID = 0;int count=0;int rep =0;
		Arrays.sort(c);
		for(int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }
		System.out.println();
		if(n%2==0){
			houseID = c[0] + 2;
		}else{
			houseID = c[0] + 1;
		}
		while(houseID<=c[n-1]){
			count++;
			System.out.println(houseID);
			if(rep == 1){
				//count--;
				houseID--;
			}
			houseID = houseID + k + 1;
			rep=1;
		}
		System.out.println(count);
	}

	private static int okay(int[] c, int n, int m) {
		// TODO Auto-generated method stub
		if(n<0) return 0;
		else if(n==0) return 1;
		else if(m<=0) return 0;
		else {
			return okay(c,n,m-1) + okay(c,n-c[m-1],m);
		}
	}

}
