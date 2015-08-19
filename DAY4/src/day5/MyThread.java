package day5;

public class MyThread extends Thread {

	public void run(int count)
	{
			try
			{
				
				
				System.out.println("My thread "+(count));
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		
	}

	}

	

