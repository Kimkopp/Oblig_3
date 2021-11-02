public class LeapYear {
    static boolean isLeapYear(int year) {
        if (year % 400 != 0 && year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}