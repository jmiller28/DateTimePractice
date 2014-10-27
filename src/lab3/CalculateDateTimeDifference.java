package lab3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author jmiller
 */
public class CalculateDateTimeDifference {

    public String getCalculatedDifference(String startDateTime, String endDateTime, DateTimeFormatter formatter) throws DateTimeParseException {

        try {
            LocalDateTime start = LocalDateTime.parse(startDateTime, formatter);
            LocalDateTime end = LocalDateTime.parse(endDateTime, formatter);
            long diffInHours = java.time.Duration.between(end, start).toHours();
            long diffInMinutes = java.time.Duration.between(end, start).toMinutes();
            diffInMinutes -= (diffInHours * 60);
            return (diffInHours + " hours, " + diffInMinutes + " minutes");
        } catch (DateTimeParseException dtpe) {
            throw new DateTimeParseException("Error: " + dtpe.getMessage(), startDateTime , 0);
        }
    }
}
