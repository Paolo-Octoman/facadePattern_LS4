public class Light implements HomeService{

    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}
