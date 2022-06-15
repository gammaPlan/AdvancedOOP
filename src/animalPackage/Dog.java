package animalPackage;

public class Dog extends Mammal{

    private boolean adoptedDog;
    private int age;

    public Dog(String type, String name,boolean adoptedDog,int age) {
        super(type, name,"Mammal");
        this.adoptedDog=adoptedDog;
        this.age=age;
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat bits");
    }

    public void speak(){
        System.out.printf("%s says, \"Woooff\"", this.getName());

    }
}
