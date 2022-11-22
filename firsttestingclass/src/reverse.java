
public class reverse {

	public static void main(String[] args) {
		// reverse individual of giving string
		  String s5 ="world of great software engg. with selenium";
	        
	        //[world, of ,great ,software ,engg., with ,selenium];   s5 to array
	         
	        String[]s6=s5.split(" ");
	        String revString = "";
	        for (int k=0; k<=s6.length; k++) {
	        	String s7=s6[k];
	        	String s6arr="";
	        	for (int l=s7.length()-1 ; l>=0; l--) {
	        		s6arr=s6arr+s7.charAt(l);      //reverse 1st word
	        	}
	        	revString =s6arr+" ";
	        	System.out.print(revString);
	        }
	        
	        

	}

}
