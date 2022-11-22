package methodoverriding;

public class parentclass {

	void f1() {
		int a=34;
		int b=54;
		int c=a*b;
		System.out.println("riddhi");

	}
      void f1( String s) {
    	  float f=2332f;
    	  System.out.println(f);
    	  int d=14;
    	  int e=45;
    	  int g=d*e;
    	  
      }
      static void f2 () {
    	  System.out.println("the class of static parent");
      }
}
