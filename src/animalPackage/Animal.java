package animalPackage;

public abstract class Animal {
    //member atributes
    private String type;
    private String name;
    private String classification;

    //constructor
    public Animal(String type, String name, String classification) {
        this.type=type;
        this.name=name;
        this.classification= classification;

    }

    
    

    //getters setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclassification() {
        return classification;
    }

    public void setclassification(String classification) {
        this.classification = classification;
    }

    public abstract void eat();
}
