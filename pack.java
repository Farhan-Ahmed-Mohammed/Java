import java.util.ArrayList;
import java.util.Date;

public class pack
{
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Apple");
        arr.add("Mango");
        arr.add("Orange");

        for(String s: arr)
        {
            System.out.println(s);
        }
        Date d=new Date();
        System.out.println(d);
    }
}