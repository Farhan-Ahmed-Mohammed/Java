interface Animal
{
  void eat();
  void sleep();
}

class Dog implements Animal
{
    public void eat()
    {
        System.out.println("Dog eats bones");
    }

    public void sleep()
    {
        System.out.println("Dog sleeps ");
    }
}

class Cat implements Animal
{
 public void eat()
 {
    System.out.println("Cat eats fish");
 }

 public void sleep()
 {
    System.out.println("Cat sleeps");
 }
}

public class interfaceuse
{
    public static void main(String[] args)
    {
        Animal a1;
        Animal a2;
        a1=new Dog();
        a1.sleep();
        a1.eat();

        a2=new Cat();
        a2.sleep();
        a2.eat();
    }
}