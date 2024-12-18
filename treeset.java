import java.util.Scanner;
import java.util.TreeSet;


public class treeset
{
    public static void main(String[] args)
    {
        TreeSet<Integer> t=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Tree set operations :");
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to remove");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to exit");
        int n;
        do
        {
            System.out.println("Enter any of the above choises :");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter a number to be added :");
                    int e=sc.nextInt();
                    t.add(e);
                    System.out.println(e+" is added ");
                    break;

                case 2:
                    System.out.println("Enter a number to be deleted :");
                    int d=sc.nextInt();
                    if(t.remove(d))
                    {
                        System.out.println(d+"is deleted ");
                    }

                    else 
                    {
                        System.out.println(d+"is not in tree set");
                    }
                    break;

                case 3:
                    System.out.println("Printing the tree set");
                    for(int i:t)
                    {
                        System.out.println(i);
                    }
                    break;

                case 4:
                    System.out.println("Exiting form the tree set");
                    break;   

                default:
                    System.out.println("Invalid choise");
                    break;     

            }
        }while(n!=4);
    }
}