import java.util.Iterator;
import java.util.LinkedList;

public class iterator
{
    public static void main(String[] args) 
    {
        {
            LinkedList<Integer> l=new LinkedList<>();
            for(int i=0;i<10;i++)
            {
                l.add(i);
            }

            Iterator j=l.iterator();

            System.out.println("All the elements of linkedlist are :");
            while(j.hasNext())
            {
                System.out.print(j.next()+" ");
            }
        }
    }
}