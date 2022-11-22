package firsttestingclass;

public class method {
	  int s=76;
	  static int r=8765;
public static void main(String[] args) {
	         method obj=new method();
	         method.m1();
	  System.out.println("c");
	  obj.m2();
	  System.out.println("k++");
	  method.m3();
	  System.out.println("obj.m3");
	  obj.m4();
	  method.m6();
	  System.out.println("pratik");
	  obj.m7();
	  System.out.println("r++");
	 
}
		static void m1()  //static method without argument;
		 
		{
		int a= 40;           //retun not to madatory;
		int b=20;
		int c=a/b;
		System.out.println( "print the modular");
		}
		void m2()       //non static method without argument
		{
		 int k=980;//return not to be madatory;
		 k++;
		 System.out.println("post increment of k++");
		}
		
		static int m3()      //static method with return;
		{
		int m=546;	
		return 546;	
		}
		String m4()            //non static with return
		{
		 System.out.println( "s");	
		 return "java is the worst";
		}
		
		 static int m6()
		 {
			 
			 return 1;
			 }
          int m7()
          {
           int q=65;
           r++;
          System.out.println("r++");
          return 65;
          }
          
          
          
          
          
          
          
}

		
		
		
		
		
		
				

		
		
		
		
		
		
		
		
		
		
		
		



