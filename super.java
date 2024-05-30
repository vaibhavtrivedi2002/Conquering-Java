class Animal {
  public void identify() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {
  @Override
  public void identify() {
    super.identify(); // Call the superclass method
    System.out.println("I am a dog.");
  }
}

public class super{
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.identify();
  }
}
