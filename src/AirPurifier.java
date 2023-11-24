public class AirPurifier {
    //Instance Variables: use 3 variables(model,serialNo,power) to assign values to each object
    private String model;
    private String serialNo;
    private boolean power;

    //Class Variables: use AirPurifierCount to keep track of the total amount of AirPurifiers
    private static int AirPurifierCount = 0;

    //Constructor: take 2 string inputs for model and serialNo,
    // set default power to "false",
    // count the number of AirPurifier everytime the constructor is used
    public AirPurifier(String _model, String _serialNo){
        model=_model;
        serialNo=_serialNo;
        power=false;
        AirPurifierCount++;
    }

    //Instance Method: use turnOn/turnOff to change the power status of an instance
    void turnOn(){power=true;}
    void turnOff(){power=false;}

    //Class method: use totalAirPurifiers to give the current amount of AirPurifiers
    //use giveInfo to display info of the AirPurifier
    public static void totalAirPurifiers(){
        System.out.println("Current amount of AirPurifiers: "+AirPurifierCount);
    }
    public static void giveInfo(AirPurifier ap){
        System.out.println("Model: "+ap.model);
        System.out.println("SerialNo: "+ap.serialNo);
        System.out.println("Is On?: "+ap.power);
    }

    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("xxx","123abc");
        a.turnOn();
        totalAirPurifiers();
        giveInfo(a);
        a.turnOff();

        AirPurifier b = new AirPurifier("yyy","456asd");
        b.turnOn();

        totalAirPurifiers();
        giveInfo(a);
        giveInfo(b);
    }
}
