public class HomeInterface {
    private Light l;
    private TV t;
    private AirConditioning a;

    public HomeInterface() {
        l = new Light();
        t = new TV();
        a = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("Turning on all home services...\n");
        l.turnOn();
        t.turnOn();
        a.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning off all home services...\n");
        l.turnOff();
        t.turnOff();
        a.turnOff();
    }
}
