package opp_2_3;

public class Car extends Transport implements TireReplacement, CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
