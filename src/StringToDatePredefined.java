import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDatePredefined {
  public static void main(String[] args) {
    // Format y-M-d or yyyy-MM-d
    String string = "2017-07-25";
    LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
    // LocalDate date = LocalDate.parse(string, DateTimeFormatter); - ISO_DATE can also be removed

    System.out.println(date);
  }
}

// predefined formatter ISO_DATE - takes date string in the format 2017-07-25 or 2017-07-25+05:45'
// LocalDate's parse() - parses the given string using the given formatter.
