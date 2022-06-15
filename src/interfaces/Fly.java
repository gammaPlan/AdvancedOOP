package interfaces;

public interface Fly {
    public default void fly() {
        System.out.println("This animal is flying");
    }
}
