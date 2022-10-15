package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year>0 && month>0 && month<13){
            if (year%400==0 || (year%4==0 && year%100!=0)) System.out.println("leap");
            else System.out.println("invalid date");
        }

    }
}
