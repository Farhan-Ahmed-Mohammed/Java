import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map
{
    public static void main(String[] args) 
    {
        
            Map<Integer,Integer> m=new HashMap<>();
            System.out.println("Map operations :");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            Scanner sc=new Scanner(System.in);
            int n;
            do
            {
                System.out.println("Enter any of the above operation");
                n=sc.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.println("Enter two integers to add :");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        m.put(a,b);
                        System.out.println(a+" and "+b+" are added ");
                        break;

                    case 2:
                        System.out.println("Enter number to be deleted :");
                         int d=sc.nextInt();
                        if(m.containsKey(d))
                        {
                                if(m.isEmpty())
                            {
                                System.out.println("The map is empty ");
                            }

                            else
                            {
                        
                            m.remove(d);
                            System.out.println(d+" is removed from m");
                            
                            }
                        }
                        
                        else
                        {
                            System.out.println("The element is not present in map");
                        }
                       
                        break;

                    case 3:
                        System.out.println("Displaying the map :");
                        for (Map.Entry<Integer, Integer> entry : m.entrySet()) 
                        {
                            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                        }
                        break;
                    

                    case 4:
                        System.out.println("Exiting the map");
                        break;
                }
            }while(n!=4);
    }
}


              
