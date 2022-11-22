package methodoverriding;

public class childclass extends parentclass {
	
	
  void f1() {
	  System.out.println("returntype");
	  super.f1("ttt");
  }
  void f1(String s) {
	  System.out.println("returntype2");
	  super.f2();
  }
  static void f2() {
	  System.out.println("return no");
  }
  static void f2(String g) {
	  System.out.println("no one");
	  
  }
    
}
