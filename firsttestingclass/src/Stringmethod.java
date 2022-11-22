
public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String ath ="Atharrva" ;
	
	/*  System.out.println(ath.charAt(3));
	  System.out.println(ath.length());

	  System.out.println(ath.toLowerCase());
	  System.out.println(ath.toUpperCase());

	  System.out.println(ath.indexOf('t'));
	  System.out.println(ath.indexOf('2'));

	  System.out.println(ath.concat("kaju"));*/
	  
	  String kt = ath+"K"+"d";
	  String kg = ath+kt+'d';
	  System.out.println(kt);

	  System.out.println( ath.concat(kt));
	  System.out.println(ath.equals("Atharrva"));

	  System.out.println(ath.equalsIgnoreCase(ath));
	  System.out.println(ath.equalsIgnoreCase("Atharrva"));

	  System.out.println(ath.contains("RRVA"));
	System.out.println(ath.contains("rrva"));

	}

}
