import java.util.StringTokenizer;

public class String_Tokenizer
{
    public static void main(String[] args)
    {
        String a="This sentence is going to be broken down ";
        StringTokenizer st=new StringTokenizer(a);

        while(st.hasMoreTokens())
        {
            String b=st.nextToken();
            System.out.println(b);
        }
    }
     
        
    
}