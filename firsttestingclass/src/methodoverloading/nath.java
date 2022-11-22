package methodoverloading;

public class nath {
      
	
	    void m1() {
	    	System.out.println("m1 without argument");   //method overloading
	    }
	    
	    void m1(int a,int c) {
	    	
	    System.out.println("m1 with two int");}
	    
	    void m1(int a,String s) {
	    	System.out.println("m1 with string & int");
	    }
	    void m1 (float f,String s) {
	    	System.out.println("m1 with float,string");
	    }
	    static void m() {
	    	System.out.println("static jalwa");}
	    
	    
	    	static void m(int c,int a) {
	    	System.out.println( "static int jalwa");
	    }
	    
			// static method overloading
	    	static void m2() {
	    		System.out.println("overloading jalwa");
	    	}
           static void m2(String s) {
        	   System.out.println("overloading jalwa by string");
           }
		}


