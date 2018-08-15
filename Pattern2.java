package day1.patternprograms;

public class Pattern2 {

	public static void main(String[] args) {
/*		* * *
 		* *
 		* 
 */
for(int row=1;row<=3;row++)
{
	for(int col=3;col>=row;col--)
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
