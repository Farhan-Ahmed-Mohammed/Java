
class sync
{
    synchronized void tf(int n)
    {
        try
        {
            for(int i=1;i<=7;i++)
        {
            System.out.println(n+i);
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}

public class threadSync
{
    public static void main(String[] args)
    {
        sync o=new sync();
        Thread a=new Thread()
        {
            public void run()
            {
                o.tf(15);
            }
        };

        Thread b=new Thread()
        {
            public void run()
            {
                o.tf(30);
            }
        };
        
        a.start();
        b.start();

    }
}
