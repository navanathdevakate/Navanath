package methodoverloading;

public class nonstatic {
public static void main(String[] args) {
	
	
	
	     nath obj=new nath();  ///for nonstatic
	       obj.m1();
	       obj.m1(10, "kaju");
	       System.out.println("kaju " + " devakate");
	       obj.m1(30, 70);
	       
	       obj.m1(45.455f, "devakate");

	       obj.m();  //for static
	       obj.m(60, 50);
	        obj.m2();
	        nath.m2("class");
	        System.out.println("KAJU");
	       
}
       public static void main() {
            
    	   nath obj1= new nath();
    	   
    	  obj1.m1();
    	  System.out.println("main jalwa");
    	  obj1.m1(5445, 45);
    	  System.out.println("MY PRINCE KAJU");

}

}



