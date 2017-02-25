package HackerRank;

public class Nearsetzeroone {
	
	
	static int foundInBermudatriangle(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py, int bx, int by) {
        int returnValue = 0;
        float area = findArea(x1,x2,x3,y1,y2,y3);
        if(area == 0){
            returnValue = 0;
        }
        float areap1 = findArea(px,x2,x3,py,y2,y3);
        float areap2 = findArea(x1,px,x3,y1,py,y3);
        float areap3 = findArea(x1,x2,px,y1,y2,py);
        float areab1 = findArea(bx,x2,x3,by,y2,y3);
        float areab2 = findArea(x1,bx,x3,y1,by,y3);
        float areab3 = findArea(x1,x2,bx,y1,y2,by);
        float boatArea = areab1+areab2+areab3;
        float planeArea = areap1+areap2+areap3;
        if(area == boatArea && area == planeArea){
            returnValue =  3;
        }else if(area != boatArea && area != planeArea){
            returnValue = 4;
        }else if(area == boatArea && area != planeArea){
            returnValue = 2;
        }else if(area != boatArea && area == planeArea){
            returnValue = 1;
        }
    return returnValue;
}

	
	
static float findArea(int x1,int x2,int x3,int y1,int y2,int y3){
    return (float)Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
}
	

static String improbabilityCalculator(String coordinates, int remove) {
    String minValue = "";
    StringBuilder minValBuilder = new StringBuilder();
    minValue = findMinValue(coordinates, remove, minValBuilder);
    return minValue;
}

static String findMinValue(String coordinates, int remove, StringBuilder minValBuilder){
    
    if(remove == 0){
        return minValBuilder.append(coordinates).toString();
    }
    if(coordinates.length() < remove){
        return minValBuilder.append(0).toString();
    }
    int initialValue = 0;
    int length = coordinates.length();
    for(int i=1;i<=remove;i++){
        if(Character.getNumericValue(coordinates.charAt(i)) < Character.getNumericValue(coordinates.charAt(initialValue))){
            initialValue = i;
        }
    }
    minValBuilder.append(coordinates.charAt(initialValue));
    String val = coordinates.substring(initialValue+1,length);
    findMinValue(val,remove-initialValue,minValBuilder);
    return minValBuilder.toString();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		improbabilityCalculator("4359768", 2 );
		//foundInBermudatriangle(0,0,2,0,4,0,2,0,4,0);
		int x = 4,i=1;
		while(true){
			String bin = Integer.toBinaryString(i);
			Long num = Long.parseLong(bin);
			if(num%x==0){
				System.out.println(num);
				System.exit(0);
			}
			i++;
		}
	}

}
