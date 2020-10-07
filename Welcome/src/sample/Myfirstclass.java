package sample;

import java.util.Scanner;

public class Myfirstclass {

	public static void main(String[] args)
	{
		int i=15;
		Scanner s=new Scanner(System.in);
		/*for(i=0;i<=10;i+=2)		{		
			System.out.println(i);	}*/
		/*while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}*/
		do
		{
			System.out.println(i);
			i+=2;
		}
		while(i<=10);
		System.out.println("Program Ended");
	}

}
