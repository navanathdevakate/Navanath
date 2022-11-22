
public class STRING {
public static void main(String[] args) {
	
	    String A = "velocity";           //1 string constant pool area  ......without new
	    String A1 = "velocity";          //point to scpa same & address will be A1
	    
	    String A2 = new String("velocity");  //with "new"...2 memory allocated i.e,one in scpa & one in heap points but,1 heap area by stord m/o A
	    String A3 = new String("velocity");  //point to scpa & stored in heap area
	    
	    String A4 = "velocity";             //Point to SCPA same A4,and A1, m/o created by A
	    
	    String B1 = new String("Class");  //with "new"...2 memory allocated i.e,one in scpa & one in heap points
	    String B2 = new String("Class");  //point to scpa & stored in heap area
	    
	    String B3 = "velocity";           //1 string constant pool area  ......without new......literals will be same
	    String B4 = "velocity";          //point to scpa same & address will be kgf1
	    
	    String D1 = "Velocity";           //v is upper case,it affected to exicution
	    
	    String K1 = "KAJU" ;              //upper case
	    String K2 = "kaju" ;              //lower case
	    
	    String K3 = new String("kaju"); 
	    
	    System.out.println(A==A1);      //true
	    System.out.println(A1==A2);     //add. change with & without new.....false
	    System.out.println(A1==B1);     //literal change
	    System.out.println(A1==B3);     //add diff but literal same......true
	    System.out.println(B1==A2);     //literal change ,add chang, ...false
	    System.out.println(B1==B2);     //add.change,lit same,with new...FALSE
	    
	    System.out.println(K1==K2);     //up & low case
	    System.out.println(D1==B3);
	    
	    System.out.println(A1.equals(A2));   ///TRUE 
	    System.out.println(A2.equals(A3));   //true  
	    System.out.println(B3.equals(A1));   //TRUE
	    System.out.println(B3.equals(A2));   //TRUE
	    
	   
}
}
