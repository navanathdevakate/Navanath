package abstraction;

public class class12 implements interface11,interface22 {

	public void m1() {     //increasing scope
		
	}
	public String m2() {
		return "interface11String" ;
}
	
	public void m5() {      //default to public
		System.out.println("default of I11");   //common both defaut m I11 ,I12
		interface22.super.m5();
		
	
	}
	
	public static void main(String[] args) {
		
		class12 IT=new class12();
		IT.m1();
		IT.m2();
		
		IT.m5();
		IT.m4();
		
		
	}
}