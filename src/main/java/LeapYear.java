public class LeapYear {
    static boolean isLeapYear(int year) {
        if (year % 400 != 0 && year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}