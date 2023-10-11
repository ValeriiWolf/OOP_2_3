package opp_2_3;

public class Truck extends Transport implements CheckEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
