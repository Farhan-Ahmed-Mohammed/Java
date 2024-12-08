abstract class Animal
{
    public void sleep()
    {
        System.out.println("The animal is sleeping ");
    }
    public abstract void sound();
}

class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Cats says meow");
    }
}

public class Abstrac
{
    public static void main(String[] args)
    {
        Animal a1;
        a1=new Dog();
        a1.sleep();
        a1.sound();

        System.out.println();
        
        a1=new Cat();
        a1.sleep();
        a1.sound();
    }
}