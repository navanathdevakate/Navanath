package pacakage;

public class starpattern5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=i; l++)
			{
			System.out.print("+");
		}
		
			for(int k=2; k<=i; k++)
			{
				System.out.print("+");
			}
		System.out.println();    //LINE Execute
		}
	}

}
