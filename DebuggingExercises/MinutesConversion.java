import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        final int HOURS = 60;
        final int DAYS = 24;
        int minutes;
        float daysConvert;
        float hourConvert;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of minutes>>> ");
        minutes = inputDevice.nextInt();
        hourConvert = minutes / HOURS;
        daysConvert = hourConvert / DAYS;
        System.out.printf("%s minutes equals %.0f hours and equals %.3f days",
                minutes, hourConvert, daysConvert);
    }
}
