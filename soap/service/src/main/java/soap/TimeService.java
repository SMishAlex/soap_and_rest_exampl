package soap;

import javax.jws.WebMethod;
import java.util.Date;

public interface TimeService {
    @WebMethod
    Date getCurrentDate();

    @WebMethod
    Date getDateAfterFewDays(Integer days);
}
