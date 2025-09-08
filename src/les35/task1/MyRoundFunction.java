package les35.task1;

public class MyRoundFunction implements MyFunction{
    @Override
    public Long getResult(Double value) {
        System.out.println("Der übergebene Wert ist - " + value);
        return Math.round(value);
    }
}
