import ooo.part4.transport.Truck;

public class DriverC extends Driver <Truck> {

    public DriverC (String fullName, int drivingExperience, Truck car) {
        super (fullName, category:"C", drivingExperience, car);
    }
}