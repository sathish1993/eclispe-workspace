package HackerRank;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int arr[][] = new int[n][n];
		int count = 0,l=0,m=0;
		boolean whilestmt = true;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				count = count +1;
				arr[i][j] = count; 
			}
		}
		
			
			while(m<=n-1){
				System.out.print(arr[l][m]);
				m++;
			}
			m--;
			l++;
			while(l<=n-1){
				System.out.print(arr[l][m]);
				l++;
			}
			l--;
			while(m>=0){
				m--;
				if(m!=-1)
				System.out.print(arr[l][m]);
				
			}
			m++;
			System.out.println("l nad m "+l + m);
			while(m<=n/2){
				System.out.print(arr[l][m]);
				m++;
			}
	}

}
