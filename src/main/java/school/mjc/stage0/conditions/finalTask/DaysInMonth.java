package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year>0 && month>0 && month<13){
            switch (month){
                case 4,6,9,11: System.out.println("30");break;
                case 2 :
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println("29");break;}
                    else System.out.println("28");break;
                default:
                    System.out.println("31");break;
            }

        }

        else System.out.println("invalid date");
    }
}
