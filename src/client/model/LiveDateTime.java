package client.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Template for LiveDateTime object.
 * LiveDateTime contains the different formats for specifying the time, date, and day of the week.
 */
public class LiveDateTime extends Thread {
    /**
     * The format for the time (HH:MM AM/PM MARKER)
     */
    private static SimpleDateFormat timeFormat;
    /**
     * The format for the day that specifies the whole text.
     */
    private static SimpleDateFormat dayFormat;
    /**
     * The format for date in MMMM dd, YYYY format (e.g., February 19, 2024).
     */
    private static SimpleDateFormat dateFormat;
    /**
     * The time
     */
    private volatile String time;


    /**
     * Constructs an object of LiveDate Time with default values.
     */
    public LiveDateTime() {
        timeFormat = new SimpleDateFormat("hh:mm a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        start();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                time = setTime();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String setTime() {
        Date currentTime = Calendar.getInstance().getTime();
        return dateFormat.format(currentTime) + " | " +
                dayFormat.format(currentTime) + " " +
                timeFormat.format(currentTime);
    }


    public String getTime() {
        return time;
    }

    public static String getTimeForTimerComparisons() {
        Date currentTime = Calendar.getInstance().getTime();
        timeFormat = new SimpleDateFormat("hh:mm:ss");
        return timeFormat.format(currentTime);
    }

    public static String getDate() {
        Date currentTime = Calendar.getInstance().getTime();
        dateFormat = new SimpleDateFormat("MM/dd/yy");
        //currentTime.after(1)
        return dateFormat.format(currentTime);
    }


    /**
     * Retrieves the current format for time.
     * @return The current format for time.
     */
    public SimpleDateFormat getTimeFormat() {
        return timeFormat;
    }

    /**
     * Retrieves the current format for day.
     * @return The current format for day.
     */
    public SimpleDateFormat getDayFormat() {
        return dayFormat;
    }

    /**
     * Retrieves the current format for date.
     * @return The current format for date.
     */
    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public static void main(String[] args) {
        LiveDateTime dateTime = new LiveDateTime();
        String c = dateTime.getDate();
        System.out.println(c);
    }
}
