class Animal        //parent class
{
    void sound()
    {
        System.out.println("Anime class ");
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
    void sound()
    {
        System.out.println("Cats says meow");
    }
}

public class inheritance
{
    public static void main(String[] args)
    {
        Animal animal;
        animal=new Dog();
        animal.sound();

        System.out.println();

        animal=new Cat();
        animal.sound();

        System.out.println();

        Dog dog=new Dog();
        dog.sound();

        System.out.println();

        Cat cat=new Cat();
        cat.sound();

        System.out.println();

        Dog d1=new Animal();
        d1.sound();
    }
}