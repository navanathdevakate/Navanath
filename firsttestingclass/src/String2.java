
public class String2 {

	public static void main(String[] args) {
		
		   //String methods...
		
		String A ="literal3";
		
		System.out.println(A.replace('l', '2'));
		System.out.println(A.replace("lit", "upp"));
        System.out.println(A.replaceAll("literal","class "));
        System.out.println(A.replaceFirst("l","b"));
        
        String B = " ";
        System.out.println(B.isBlank());    //space not be consider then it true
        System.out.println(B.isEmpty());   //space should be consider  false
        System.out.println("kaju********");
        
        String C = "the amazing velocity class ";
        String D [] = C.split(" ");
        
        System.out.println(D[2]);
        System.out.println(D[0]);
        System.out.println(D[2]);
        System.out.println(D[3]);
        
        char V= '0';
        int a = V;
        System.out.println(a);    ///other datatype value initialize
        
        String E = "abcdeab";   //compare here
        String F = "abcdea";
        System.out.println(E.compareTo(F));
        System.out.println(F.compareTo(E));
        
        int b ='1';
        char v = 'b';   //asign value of b
        System.out.println(v);
        
        char n = '3';    ///     Ascii value be printed
        int c =n;
        System.out.println(c);
	}
}
