import java.sql.Array;
import java.util.Arrays;

public class Acendingorderarray {

	public static void main(String[] args) {
		// Ascending order array
		int a[]= {5,2,9,0,3,1,4,7,6,8};
		
		//int c[]=new int[7];
		//method is used to sort a array
		//int lastindex = a.length-1;   //int return
		Arrays.sort(a);    //return type void , argument byte
		System.out.println(a.length);
		for (int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

		//array in descending array
		
		int m[] = {120,15,132,65,85,45,79,98,23,21,52,30};
		Arrays.sort(m);
		for (int j =m.length-1; j>=0; j--)
		{
			System.out.print(m[j] + (" "));
		}
		
	}

}
