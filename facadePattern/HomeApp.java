public class HomeApp {
    public static void main(String[] args) {
        HomeInterface h = new HomeInterface();
        h.turnOnAll();
        System.out.println();
        h.turnOffAll();
    }
}
