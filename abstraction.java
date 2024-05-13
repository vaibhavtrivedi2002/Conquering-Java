abstract class abstraction {
  public abstract void makeSound();
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

public class AbstractionExample {
  public static void main(String[] args) {
    Animal animal;  // Declare an Animal reference variable

    animal = new Dog();  // Create a Dog object
    animal.makeSound();  // Call makeSound() on the Dog object (polymorphism)

    animal = new Cat();  // Create a Cat object
    animal.makeSound();  // Call makeSound() on the Cat object (polymorphism)
  }
}
