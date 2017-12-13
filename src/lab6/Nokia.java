package lab6;

public class Nokia implements Phone {
    @Override
    public void call() {
        System.out.println("Звонок с Нокии");
    }

    @Override
    public String toString() {
        return "Nokia";
    }
}
