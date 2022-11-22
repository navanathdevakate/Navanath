package constructor;

public class class1 {
	public static void main(String[] args) {
		class1 obj=new class1(10,20,"ss");
	     class1 kd=new class1(10) ;
	      class1 hi=new class1(10,26.8f);
	}
	     int a=20;
	     float b;

	   class1()  {
		   
		   System.out.println("world of java");
	   }
	   class1(int c)  {
		   a=c;
		   b=40;
		   int d=(a*40);
		   System.out.println(d);
	   }
	   class1(int c,int b,String s){
		    float f=20.6f; 
		   
		   b=400;
		   System.out.println(f);
		   
	   }
	   class1(int a,float b)    {
		   this.a=a;
		   
		   System.out.println(this.a);
	   }  
		   
	   }
	
      

