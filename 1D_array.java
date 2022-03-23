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
		
		System.out.println(Arrays.toString(nums)); // converts the whole array into a string
		int i = 0 ;
		for (i=0;i<5 ;i++ ){
			System.out.println(a[i]);
		} 
	}
}
