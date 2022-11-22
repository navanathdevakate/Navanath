package abstraction;

public interface interface11 {

	int a=10;     //public+static+final
	
     void m1();      //(public+abstract)
 	
   
   String m2 () ;  //abstract method (public+abstract)
	
   static void m3() {                           
   System.out.println("the static method m4");
   }
   
   default void m4() {
	   System.out.println("the default interface");
	   
   }
   default void m5() {
	   System.out.println("child class interface");
	   
	   
   }
}

	

         

