package sample;

public class MyFourthClass {

	public static void main(String[] args) 
	{
		long l1=System.currentTimeMillis();
		String s1=new String("Java");
		for(int i=0;i<100000;i++)
		{
			s1=s1.concat("Class");
		}
		System.out.println(System.currentTimeMillis()-l1);
		long l2=System.currentTimeMillis();
		StringBuilder s2 = new StringBuilder("Java");
		for(int i=0;i<100000;i++)
		{
			s2=s2.append("Class");
		}
		System.out.println(System.currentTimeMillis()-l2);
		long l3=System.currentTimeMillis();
		StringBuffer s3 = new StringBuffer("Java");
		for(int i=0;i<100000;i++)
		{
			s3=s3.append("Class");
		}
		System.out.println(System.currentTimeMillis()-l3);
	}

}
