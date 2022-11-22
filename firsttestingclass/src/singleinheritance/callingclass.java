package singleinheritance;

public class callingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         class1 Kaju=new class1();       //calling for static & non-static method
              
         Kaju.m1();
         System.out.println("velo");
         
         Kaju.m2();
         System.out.println("nath");
         
         class2 Nath=new class2();
         
         Nath.m3();
         Nath.m1();
         System.out.println("story");
	}

}
