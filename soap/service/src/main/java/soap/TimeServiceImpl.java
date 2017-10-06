package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@WebService
public class TimeServiceImpl implements TimeService {
    @Override
    @WebMethod
    public Date getCurrentDate() {
        return new Date();
    }

    @Override
    @WebMethod
    public Date getDateAfterFewDays(Integer days) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()).plusDays(days);
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
