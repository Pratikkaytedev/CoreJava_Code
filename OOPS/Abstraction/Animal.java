package OOPS.Abstraction;

abstract class Animal {
    Animal() {
        System.out.println("Here is all animals");
    }

    public abstract void sound();
}

class Lion extends Animal {

    Lion(int a ){

    }

    public void sound() {
        System.out.println("Lions is roaring");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is barking");
    }
}

class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion(100);
        d.sound();
        l.sound();
    }
}
