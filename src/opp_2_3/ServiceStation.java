package opp_2_3;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.service();
        } else if (truck != null) {
                truck.service();
        } else if (bicycle != null) {
            bicycle.service();
        }
    }
}
