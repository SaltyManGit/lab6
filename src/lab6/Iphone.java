package lab6;

public class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("Звонок с айфона");
    }

    @Override
    public String toString() {
        return "Iphone";
    }
}
