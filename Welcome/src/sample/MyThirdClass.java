package sample;

import java.util.Scanner;

public class MyThirdClass {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		a=s.nextInt();
		for(int i=a;i<a+26;i++)
		{
			System.out.println((char)i);
		}
	}

}
