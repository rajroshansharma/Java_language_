import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int a[]=new int[5];//declaration and instantiation  
		a[0] = 89;
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		
	
		
		//-------------------2 Dimemsion array--------------
		int[][] num2 = new int[2][2];
		int i,j;
		i = 0;
		j = 0;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				num2[i][j] = 2*nums[i];
			}
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.println(num2[i][j]);
			}
		}
	}
}
