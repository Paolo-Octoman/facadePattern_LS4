public class TV implements HomeService{

    @Override
    public void turnOn() {
        System.out.println("TV is turned on.\nCurrent Channel: DTT-25.01\nVolume: 32");
    }

    public void turnOff() {
        System.out.println("TV is turned off.");
    }
}
