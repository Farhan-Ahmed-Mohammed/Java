
public class multithreading
{
    public static void main(String[] args)
    {
        Runnable r1=()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("i am in "+Thread.currentThread().getName()+" Thread "+i);
            }
        };

        Runnable r2=()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("i am in "+Thread.currentThread().getName()+" Thread "+i);
            }
        };

        Thread t1=new Thread(r1,"First");
        Thread t2=new Thread(r2,"Second");

        t1.start();
        t2.start();
        
    }
}