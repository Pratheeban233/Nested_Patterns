package day1.patternprograms;

public class Pattern4 {

	public static void main(String[] args) {
/*
 			    *
 			  * *
 			* * *
 */
		
		for(int row=1;row<=3;row++)
		{
			for(int col=3;col>row;col--)
			{
				System.out.print("  ");
			}
				for(int col1=1;col1<=row;col1++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}


