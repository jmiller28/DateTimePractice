package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jmiller
 */
public class CalculateDateTimeDifference {

    public String getCalculatedDifference(String startDateTime, String endDateTime, String format) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        long endMsec = sdf.parse(endDateTime).getTime();
        long startMsec = sdf.parse(startDateTime).getTime();
        long diff = startMsec - endMsec;

        long hours = TimeUnit.MILLISECONDS.toHours(diff);
        diff -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);

        return (hours + " hours, " + minutes+ " minutes");

    }
}
