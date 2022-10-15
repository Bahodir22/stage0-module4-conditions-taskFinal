package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int b = dividend/divider;
        if (divider==0){
            System.out.println("/ by zero");
        }
        else if (dividend==b*divider){
            System.out.println("can be divided completely");
        } else System.out.println("cannot be divided completely");
    }
}
