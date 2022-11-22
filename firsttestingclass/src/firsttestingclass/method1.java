package firsttestingclass;

public class method1
{

	public static void main(String[] args) {
		 method1 obj=new method1();
		 
		 System.out.println(obj.h1());   
		 //non static method without argument using datatype as return type      TODO Auto-generated method stu	
		
		 System.out.println(h2());  //static method without argument using datatype as return type 
	}
	
          int h1() {
        	  int a=60;
        	  int b=a/12;
        	  System.out.println(b);
        	  
        	  return 34;
          }
	       static double h2() {
	        	
	        
	           double d=347d;
	           int c=56;
	            float f= (float)d%c ;
	            System.out.println(f);     
	            
	            return 65.45;
	       }	

}
