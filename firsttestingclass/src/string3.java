
public class string3 {

	public static void main(String[] args) {
		// reverse str
               
		String str = "this is the pratyunsh as juninor dev";
		int LastIndex=str.length()-1;
	
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--)   //lenth-1=index(index is 0)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
		String A="VELOCITY";
		System.out.println(A.length());
		System.out.println(A);
		
		
		for (int j=A.length()-1; j>=0; j--) {    //when we remove  ,string method use
			System.out.print(A.charAt(j));
		}
	}

}
