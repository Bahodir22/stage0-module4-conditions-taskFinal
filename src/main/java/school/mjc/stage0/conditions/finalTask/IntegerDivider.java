package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int b = dividend/divider;
        if (dividend==b*divider){
            System.out.println("can be divided completely / by zero");
        } else System.out.println("cannot be divided completely / by zero");
    }
}
