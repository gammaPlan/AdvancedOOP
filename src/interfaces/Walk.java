package interfaces;

public interface Walk {
    public default void walk() {
        System.out.println("This animal is walking");
    }
}
