package abstraction;

public class classint12 extends absclass{

	
		
		public void m4() {      //default to public
			System.out.println("default of 1");   //common both defaut m I11 ,I12
			
			
		
		}
		public void m1() {    ///wrong
			System.out.println("interface 2");
		}
		
		public static void main(String[] args) {
			
			absclass it=new classint12();
			it.m1();
			it.m2();
			System.out.println(it.m2());
			it.m4();
		
			
			
			
		}

	}


