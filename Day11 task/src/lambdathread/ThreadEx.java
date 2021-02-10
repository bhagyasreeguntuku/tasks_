package lambdathread;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(()->{ 
			
		
			for(int i=1;i<=25;i++)
			{
				
			try
		{
			Thread.sleep(1000);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			
			System.out.println(i);
			}System.out.println("thread 1 complete");
	
});
		
		Thread t2=new Thread(()->{ 
			
			
			for(int i=26;i<=50;i++)
			{
				
			try
		{
			Thread.sleep(1000);
			
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			
			System.out.println(i);
			}System.out.println("thread 2 complete");
	
});
		Thread t3=new Thread(()->{ 
			
			
			for(int i=51;i<=75;i++)
			{
				
			try
		{
			Thread.sleep(1000);
			
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			
			System.out.println(i);
			}System.out.println("thread 3 complete");
	
});
		Thread t4=new Thread(()->{ 
			
			
			for(int i=76;i<=100;i++)
			{
				
			try
		{
			Thread.sleep(1000);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
			
			System.out.println(i);
			}System.out.println("thread 4 complete");
	
});
t1.start();	
t2.start();	
t3.start();	
t4.start();	

		}
	}


