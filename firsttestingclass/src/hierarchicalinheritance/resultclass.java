package hierarchicalinheritance;

public class resultclass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		class1 gana=new class1();
		gana.m1(); //method of class 1
		gana.m2();
		 System.out.println("achiever");
		 
		class2 shambu=new class2();
		  //class 2 method
	shambu.m1();   //class 1 method
		
		
		class3 dev=new class3();
				dev.m4();
		        dev.m1();
		
		
	}
}
