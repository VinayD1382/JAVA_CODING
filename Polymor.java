package oopsjava;

class Anim {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Anim {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Anim {
    @Override
  public void makeSound() {
        System.out.println("Meow");
    }
}

public class Polymor {
    public static void main(String[] args) {
        Anim myDog = new Dog();
        Anim myCat = new Cat();

        myDog.makeSound(); // Outputs "Bark"
        myCat.makeSound(); // Outputs "Meow"
    }
}
