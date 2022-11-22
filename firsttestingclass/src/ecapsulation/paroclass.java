package ecapsulation;

public class paroclass {
   
	     
	    int s=20;                 
	    String r = "velocity";
	   private int e=10;
	   private int c=2;
	   float d=56.00f;
	    //getter
	    String getA() {
	    	return r;
	    }
	    
	    int getB() {
	    	int s=10;
	    
	    	return this.s;
	    }
	    
	    //setter
	     void setA(float f) {
	    	String r="sat";
	    	this.s=s;
	    	System.out.println("float");
	    	
	    }
	     void setB(int e,int c) {
	    	int d=e*c;
	    	this.e=e;
	    	System.out.println(d);
	    	System.out.println(this.e);
	    	
	    }
	     //pojo class for 100% encapsulation only
	     public int getC() {           //encapsulation 100% for get method
	    	 return e;
	    	 
	     }
	     public int setC(int e) {           //encapsulation 100% for set method
	    	 this.c=e;
	    	 System.out.println("complete setter only set");
	    	 return e;
	     }
	     
	            // 50% encapsulation
	     public float setD() {
	    	 System.out.println("the setter");
	    	  return d;
	    	  
	      }
	      public float getD() {
	    	  float d=30.00f;
	    	  
	    	  return this.d;
	      
	      }
	             
	     
	     
}

