import java.util.Scanner;

class assignmentq1
{
  public static void main(String args[])
  {
    System.out.print("Enter number of subjects :");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String problem="";

  try
  {

  int[] marks=new int[n+1];      //array declaration and array Instantiation
   int sum=0;
   System.out.println("Enter marks of " +n+ " subjects :");
    for(int i=1;i<=n;i++)
    {
        marks[i]=sc.nextInt();
        if(marks[i]>100 || marks[i]<0)
        {
            problem="Invalid marks";
            break;
        }
    }
     if(problem.isEmpty())
{
    System.out.println("University College Program");
    System.out.println("year 2023");
    System.out.println("Name of the student: Mohammed Farhan Ahmed");
    System.out.println("Roll number: 100523729043");
    System.out.println("Memorandom of Marks");
    System.out.println();

  for(int i=1;i<=n;i++)
  {
    System.out.print("Subject"+i);
    System.out.print("  ");
    System.out.print(marks[i]);
     System.out.println();
     sum=sum+marks[i];
  }
  System.out.println();

  
     double avg=sum/n;
     String avgTwo= String.format("%.2f",avg);

   System.out.println("Result: pass");
   System.out.println("Average score:"+avgTwo);
}
   

  }
 
  catch(Exception e)
  {
    System.out.println("Remarks:"+e.getMessage());
    return;
  }
  
  System.out.println("Remarks:"+problem);

 }

}