package abstraction;

public abstract class class1 {
	
	                   int a=10;
	                  class1(){
	                	   System.out.println("the constructor of class1");
	                   }

	        
	                 abstract public void m2();     //abstract method   /incomplete method    //with access modifier
	                 
				
	                public void m1() {
	                System.out.println("its complete method m1");    //concrete method
	                }
	                
	                abstract String m3 () ;  //abstract method   //incomplete method   100% abstraction
					
	                static void m4() {                           //0% abstraction
	                System.out.println("the static method in abstract class m4");  
	                }

					

}          