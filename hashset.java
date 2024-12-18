import java.util.HashSet;
import java.util.Scanner;

public class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> l=new HashSet<>();
        System.out.println("Linked list operations :");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. check");
        System.out.println("5. Exit");
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
                    System.out.println(e+" is added in the HashSet");
                    break;

                case 2:
                   
                    if(l.isEmpty())
                    {
                        System.out.println("The list is empty :");
                    }
                    else
                    {
                         System.out.print("Enter a number to be deleted form the Hash set :");
                         int d=sc.nextInt();
                        if(l.remove((Integer) d))
                    {
                        System.out.println(d+" is removed form the HashSet");
                    }   

                    else
                    {
                        System.out.println(d+" is not there in the Hashset");
                    } 
                    }
                    
                    break;

                case 3:
                    System.out.print("Printing the Hashset :");
                    System.out.print("[");
                    for(int i:l)
                    {
                        System.out.print(i+" ");
                    }
                    System.out.print("]");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter a number to check if it is present or not :");
                    int x=sc.nextInt();
                    if(l.contains(x))
                    {
                        System.out.println(x+" is present in the Hashset");
                    }

                    else
                    {
                        System.out.println(x+" is not present in the Hashset");
                    }
                    break;
           
                case 5:
                    System.out.println("Exiting form the linked list ");
                    break;
            }
        }while(n!=5);

    }
}