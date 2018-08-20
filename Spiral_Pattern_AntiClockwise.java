package day1.patternprograms;
import java.util.Scanner;
public class Spiral_Pattern_AntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of N:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[][] spiral=new int[n][n];
int mincol=0;
int minrow=0;
int maxcol=n-1;
int maxrow=n-1;
int value=1;
while(value<=n*n)
{
	for(int i=minrow; i<=maxrow; i++)
	{
		spiral[i][mincol]=value;
		value++;
	}
	for(int i=mincol+1; i<=maxcol; i++)
	{
		spiral[maxrow][i]=value;
		value++;
	}
	for(int i=maxrow-1;i>=minrow;i--)
	{
		spiral[i][maxcol]=value;
		value++;
	}
	for(int i=maxcol-1;i>=mincol+1;i--)
	{
		spiral[minrow][i]=value;
		value++;
	}
	
mincol++;
minrow++;
maxcol--;
maxrow--;
	}

	for(int row=0;row<spiral.length;row++)
	{
		for(int col=0;col<spiral.length;col++)
		{
			System.out.print(spiral[row][col]+"  ");
		}
		System.out.println();
		}
		
	
}
	}


