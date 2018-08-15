package day1.patternprograms;

public class NumberPattern {

	public static void main(String[] args) {
	/*	1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15  */
		
		int count=0;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
