
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b = "classess";
		
		int a[]=new int [8];   //upto 7 index
		a[0]=50;
		a[1]=30;
		a[2]=80;
		a[3]=12;
		a[4]=55;
		a[5]=5;
		a[6]=1;
		a[7]=66;
		
		
		System.out.println(a[3]);
		System.out.println(a[7]);
		System.out.println(a.length);   //length-1=index
		
		for (int i=0;i<a.length;i++) {   //array use so, front of length()no need
			System.out.println(a[i]);         //upto down
		}   
       for (int j=a.length-1; j>0; j--) {
    	   System.out.println(a[j]);   //down to up
    	   
       
	

       }
	}
}
