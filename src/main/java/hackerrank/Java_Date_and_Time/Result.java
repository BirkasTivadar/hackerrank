package hackerrank.Java_Date_and_Time;

import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);

        String shortDay = calendar.getTime().toString().substring(0, 3);

        return getDay(shortDay);
    }

    private static String getDay(String shortDay) {
        return switch (shortDay) {
            case "Mon" -> "MONDAY";
            case "Tue" -> "TUESDAY";
            case "Wed" -> "WEDNESDAY";
            case "Thu" -> "THURSDAY";
            case "Fri" -> "FRIDAY";
            case "Sat" -> "SATURDAY";
            case "Sun" -> "SUNDAY";
            default -> "";
        };
    }
}