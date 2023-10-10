package opp_2_3;

public interface TireReplacement {
    default void updateTyre(){
        System.out.println("Меняем покрышку");
    }
}
