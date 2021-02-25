package model.temperature;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime
{
  private Date date;

  public DateTime()
  {
    date = Calendar.getInstance().getTime();
  }
  public String getTimestamp()
  {
    SimpleDateFormat sdf = new SimpleDateFormat(
        "dd/MM/yyyy HH:mm:ss");
    return sdf.format(date);
  }

}
