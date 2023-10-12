package opp_2_3;

public class Car extends Transport implements CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}