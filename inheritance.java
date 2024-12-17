class Animal        //parent class
{
   
    
    void sleep()
    {
        System.out.println("All animals sleep");
    }
}

class Dog extends Animal    //child class 
{
  void sound()
  {
    System.out.println("Dog barks ");
  }
}

class Cat extends Animal  //child class
{
    void sound()  //over riding sound method
    {
        System.out.println("Cats says meow");
    }
}

public class inheritance
{
    public static void main(String[] args)
    {
       Dog d1=new Dog();
       d1.sleep();
       d1.sound();
       System.out.println();
       Cat c1=new Cat();
       c1.sleep();
       c1.sound();
    }
}



     
