package day5;
public class ThreadDemo {
	public static void main(String args[])
	{
		for (int i=0;i<=10;i++)
		{
		MyThread mt1=new MyThread();
		mt1.run(5*i);
		MyThread mt2=new MyThread();
		mt2.run(10*i);
		MyThread mt3=new MyThread();
		mt3.run(100*i);
		}
		
		Thread first= new Thread();
		Thread second= new Thread();
		Thread third= new Thread();

		first.setPriority(Thread.MAX_PRIORITY);
		second.setPriority(Thread.NORM_PRIORITY);
		third.setPriority(Thread.MIN_PRIORITY);
	}

}
