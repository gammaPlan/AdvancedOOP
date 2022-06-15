package animalPackage;

public class Mammal extends Animal {


    public Mammal(String type, String name, String classification) {
        super(type, name, "Mammal");
    }

    @Override
    public void eat(){
        System.out.println("Mammals also eat");
    }

}