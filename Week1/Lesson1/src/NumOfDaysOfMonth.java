import java.util.Scanner;

public class NumOfDaysOfMonth {
    public static void main(String[] args) {
        int month = -1;
        int[] daysInMonths = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] abbrMonths = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] abbrMonthsWithDots = new String[]{"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] fullNameMonths = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a month: ");

        do {
            String testMonth = keyboard.next();

            for(int i = 0; i < abbrMonthsWithDots.length; ++i) {
                if (testMonth.equals(abbrMonthsWithDots[i])) {
                    month = i;
                    break;
                }

                if (testMonth.equals(abbrMonths[i])) {
                    month = i;
                    break;
                }

                if (testMonth.equals(fullNameMonths[i])) {
                    month = i;
                    break;
                }

                try {
                    int intMonth = Integer.parseInt(testMonth);
                    month = intMonth - 1;
                } catch (NumberFormatException var12) {
                    break;
                }
            }

            if (month < 0 || month > 12) {
                System.out.println("Please re-enter the month: ");
            }
        } while(month < 0 || month > 11);

        System.out.println("Please enter a year: ");

        int year;
        do {
            year = keyboard.nextInt();
            if (year < 0) {
                System.out.println("Please re-enter the year: ");
            }
        } while(year < 0);

        int daysResult = -1;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                daysResult = daysInMonths[month];
            } else if (month == 1) {
                daysResult = 29;
            } else {
                daysResult = daysInMonths[month];
            }
        }

        System.out.println("Number of days of " + fullNameMonths[month] + ": " + daysResult);
    }
}
