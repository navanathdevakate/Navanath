package methodoverriding;

public class combopc {
public static void main(String[] args) {
	parentclass kd=new childclass();
	
	 kd.f1();
	 System.out.println("*******");
	 kd.f1("class");
	  kd.f2();
	  childclass.f2("class2");
	  kd.f1("velo");
}


	
}

