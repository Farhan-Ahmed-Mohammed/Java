class Student
{
    String name;
    int age;

    Student()           // default constructor
    {
        name="Farhan";
        age=18;
    }

    Student(String name,int age) // parameterised constructor
    {
        this.name=name;
        this.age=age;
    }

    void printdetails()  // method
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

    void printdetails(String message) // mrthod overloading 
    {
        System.out.println(message);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }


}

public class class_constructor_method
{
    public static void main(String[] args)
    {
        Student student1=new Student(); // using default constructor
        student1.printdetails();

        System.out.println(); //for space

        Student student2=new Student("Furqan",17); //using parametrised constructor now details got updated
       
        student2.printdetails();//printing the updated details 

        System.out.println();
        student2.printdetails("Student information "); //calling overloaded method 
    }
}