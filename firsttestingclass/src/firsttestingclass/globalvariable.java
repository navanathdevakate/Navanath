package firsttestingclass;

public class globalvariable {
           int a=10; 
           int c=50;//global variable//non static//instant variable
           static int d=60;      // static global variable
           public static void main(String[] args) {
		  globalvariable kd=new globalvariable();
		    kd.m1();
		  
           }
	   void m1()
	   {
		   int c=98;
		   float d=456f;//local variable
			
		   System.out.println(c);//priority goes to local variable
				  System.out.println(this.c); 
	   System.out.println(this.d);
		   System.out.println("first");
		   System.out.println(a);//calling to global variable
		   System.out.println(d);
	   }
	
	
	
	
	
	
	
	
	
}
