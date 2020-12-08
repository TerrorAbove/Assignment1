package com.ss.dpitcher.assign1;

/**
 * 
 * @author David Pitcher
 *
 */
public class Assignment1
{
	public static void main(String[] args)
	{
		System.out.println("1)");
		
		for(int i = 0; i < 4; i++)
		{
			//print i stars
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			//newline
			System.out.println();
		}
		
		System.out.println(".........");
		System.out.println();
		System.out.println("2)");
		System.out.println("..........");
		
		for(int i = 0; i < 4; i++)
		{
			//print (4-i) stars
			for(int j = 4; j > i; j--)
				System.out.print("*");
			//newline
			System.out.println();
		}
		
		System.out.println();
		System.out.println("3)");
		
		for(int i = 0; i < 4; i++)
		{
			int j;
			
			//print (5-i) spaces
			for(j = 5; j > i; j--)
				System.out.print(" ");
			
			//print (i*2 + 1) stars
			for(j = 0; j < 1+i*2; j++)
				System.out.print("*");
			
			//newline
			System.out.println();
		}
		
		System.out.println("...........");
		System.out.println();
		System.out.println("4)");
		System.out.println("............");
		
		for(int i = 0; i < 4; i++)
		{
			int j;
			
			//print (i+2) spaces
			for(j = 0; j < i+2; j++)
				System.out.print(" ");
			
			//print ((3-i)*2 + 1) ==> (7 - 2*i) stars
			for(j = 0; j < 7-i*2; j++)
				System.out.print("*");
			
			//newline
			System.out.println();
		}
	}
}
