import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class noOfbytes
{
    public static void main(String[] args) {
        {
            try
            {
                FileOutputStream f=new FileOutputStream("file1.txt");
                DataOutputStream dd=new DataOutputStream(f);
                dd.writeBytes("This is a file ");
                int n=dd.size();
                System.out.println("No of bytes in file are :"+n);
            }

            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
}