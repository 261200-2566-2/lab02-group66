public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("abcde","12345a");
        AirPurifier.totalAirPurifiers();
        a.turnOn();
        AirPurifier.giveInfo(a);
        AirPurifier b = new AirPurifier("fghij","67890b");
        AirPurifier.totalAirPurifiers();
        AirPurifier.giveInfo(b);
        a.turnOff();
        b.turnOn();
        AirPurifier.giveInfo(a);
        AirPurifier.giveInfo(b);
    }
}
