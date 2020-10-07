package sample;

import java.util.Scanner;

public class MySecondClass {

	public static void main(String[] args) 
	{
		String name,grade = null;
		int sid,mark=0,tot=0,avg=0,sub;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Subject");
		sub=s.nextInt();
		System.out.println("Enter Id");
		sid=s.nextInt();
		System.out.println("Enter Name");
		name=s.next();
		for(int i=0;i<sub;i++)
		{
		System.out.println("Enter Mark "+(i+1));
		mark=s.nextInt();
		tot=tot+mark;
		}
		avg=tot/sub;
		if(avg>=90)
			grade="A Grade";
		else if(avg<90 && avg>=70)
			grade="B Grade";
		else
			grade="C Grade";
		System.out.println("ID      :"+sid);
		System.out.println("Name    :"+name);
		System.out.println("Total   :"+tot);
		System.out.println("Average :"+avg);
		System.out.println("Grade   :"+grade);
	}

}
