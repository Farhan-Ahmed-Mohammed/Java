import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l=new LinkedList<>();
        System.out.println("Linked list operations :");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter any of the above operation :");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter a number to be added in the linked list :");
                    int e=sc.nextInt();
                    l.add(e);
                    System.out.println(e+" is added in the linkedlist");
                    break;

                case 2:
                   
                    if(l.isEmpty())
                    {
                        System.out.println("The list is empty :");
                    }
                    else
                    {
                         System.out.print("Enter a number to be deleted form the linked list :");
                         int d=sc.nextInt();
                        if(l.remove((Integer) d))
                    {
                        System.out.println(d+" is removed form the linked list");
                    }   

                    else
                    {
                        System.out.println(d+" is not there in the linked list");
                    } 
                    }
                    
                    break;

                case 3:
                    System.out.print("Printing the linked list :");
                    System.out.print("[");
                    for(int i:l)
                    {
                        System.out.print(i+" ");
                    }
                     System.out.print("]");
                    System.out.println();
                    break;
           
                case 4:
                    System.out.println("Exiting form the linked list ");
                    break;
            }
        }while(n!=4);

    }
}