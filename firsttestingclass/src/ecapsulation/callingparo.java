package ecapsulation;



public class callingparo {
     
	     public static void main(String[] args) {
	    	 
			 paroclass kgf=new paroclass();
			 
			 System.out.println( kgf.getA());
			 System.out.println( kgf.getB());
			 
			 kgf.setA(50.01f);
			 kgf.setB(10,6);
			 
			 System.out.println(kgf.getC());  //100% encap
			 kgf.setC(32);               //100% encap
			 
			 System.out.println(kgf.getD());   //50%
			    kgf.setD();                                //50%
		}
}
 