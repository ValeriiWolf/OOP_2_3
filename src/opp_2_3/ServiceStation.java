package opp_2_3;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.service();
            car.checkEngine();
        } else if (truck != null) {
                truck.service();
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            bicycle.service();
        }
    }
}
