package methodoverloading;

public class CLASS1MAIN {
	//
public static void main(String[] args) {
	
	System.out.println("MAIN CLASS");   ///jvm.......calling only (string[] args....array only
	
	
	main(10);    //calling main method by using main()    syntax
	main("to" ,34);
	main("ro",40);
	
} 
         public static void main(int c) {
        	 System.out.println("class 1");
         }
         
         public static void main( String l,float b) {
        	 System.out.println("class 2");
         }
         public static void main(String s,int f) {
        	 System.out.println("class 3");
			
		}

}
