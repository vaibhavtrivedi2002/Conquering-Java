class Animal {
  public void sound() {
    System.out.println("Generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Meow!");
  }
}

public class polymorphism {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound(); // Generic animal sound

    animal = new Dog();
    animal.sound(); // Woof!

    animal = new Cat();
    animal.sound(); // Meow!
  }
}
