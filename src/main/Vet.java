package main;
import animalPackage.Dog;
import animalPackage.Flamingo;
import animalPackage.Mammal;

public class Vet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("mammal","Jack",true,1);
        dog1.eat();
        dog1.speak();

        Flamingo flamingo1= new Flamingo("flamingo","mini");
        flamingo1.fly();
        flamingo1.walk();

    }
}