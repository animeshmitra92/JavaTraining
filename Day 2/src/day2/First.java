package day2;

public class First {
	
	int x,y,z;
	First()
	{
		x=100;
		System.out.println(x);
	}
	
	First(int y)
	{
		this();
		System.out.println(y);
		z=x+y;
		System.out.println(z);
	}
	
	public static void main(String args[])
	{
		new First(100);
		
	}

}
