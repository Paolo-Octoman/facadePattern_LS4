public class AirConditioning implements HomeService{

    @Override
    public void turnOn() {
        System.out.println("Aircon is turned on.\nTemp: 21");
    }

    public void turnOff() {
        System.out.println("Aircon is turned off.");
    }
}
