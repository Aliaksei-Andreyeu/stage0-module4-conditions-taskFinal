package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year>=0 && (month >=1 && month <=12)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31");
            } else {
                if (month == 2) {
                    if (ifYearLeap(year)){
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                } else {
                    System.out.println("30");
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }

    public boolean ifYearLeap(int year) {
        boolean ifYearLeap = year % 4 == 0;
        if (year%100==0) {
            if (year % 4 != 0 || year % 400 != 0) {
                ifYearLeap = false;
            }
        }
        return ifYearLeap;
    }
}