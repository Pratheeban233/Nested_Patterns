package day1.patternprograms;

public class NextNumber_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=0;
	for(int i=1;i<=5;i++)
	{
		if(i%2!=0)
		{
			for(int j=1;j<=5;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
		}	
		else
		{
			int temp=count+1;
			for(int k=count+5;k>=temp;k--)
			{
				count=count+1;
				System.out.print(k+" ");
			}
		}
		System.out.println();
		}
	}
		
	
	}
