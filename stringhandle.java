public class stringhandle
{
    public static void main(String[] args)
    {
        String s;
        System.out.println("String example :");
         System.out.println();
        s="Hello ";
        s+="String ";
        System.out.println(s);
        System.out.println();
        System.out.println("String Buffer Example :");
        System.out.println();
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("String Buffer");                 //String Buffer is added after hello
       
        System.out.println("After Appending :"+sb);
         sb.insert(6,"Using ");
        System.out.println("After inserting :"+sb);
        sb.delete(6,12);
        System.out.println("After deleting :"+sb);
        sb.reverse();
        System.out.println("After reversing :"+sb);
       


    }
}