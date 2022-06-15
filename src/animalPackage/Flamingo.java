package animalPackage;

import interfaces.Fly;
import interfaces.Walk;

public class Flamingo extends Bird implements Walk, Fly {
    public Flamingo(String type, String name) {
        super(type, name);
    }
}
