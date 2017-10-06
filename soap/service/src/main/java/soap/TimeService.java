package soap;

import java.util.Date;

public interface TimeService {
    public Date getCurrentDate();

    public Date getDateAfterFewDays(Integer days);
}
