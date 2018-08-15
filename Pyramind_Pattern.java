package day1.patternprograms;

public class Pyramind_Pattern {

	public static void main(String[] args) {
	/*
	 * 				 1
	 * 			   1 2 1
	 * 			 1 2 3 2 1
	 * 		   1 2 3 4 3 2 1
	 */
		int odd=1;
		int size=10;
		int space=size-1;
		for(int row=1;row<=size;row++)
		{
			int k=0;
			for(int col1=1;col1<=space;col1++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=odd;col++)
			{
				if(col<=row)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
				}
				System.out.println();
				odd=odd+2;
				space=space-1;
				}
			}
		}
		


