package client;

import soap.TimeServiceImpl;
import soap.TimeServiceImplService;

import javax.xml.datatype.XMLGregorianCalendar;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        TimeServiceImpl timeServiceImplPort = new TimeServiceImplService().getTimeServiceImplPort();

        XMLGregorianCalendar dateAfterFewDays = timeServiceImplPort.getDateAfterFewDays(1);

        System.out.printf("till: %s\n", dateAfterFewDays);

        XMLGregorianCalendar currentDate;
        currentDate = timeServiceImplPort.getCurrentDate();
        while (currentDate.compare(dateAfterFewDays) != 1) {

            System.out.print("\r" + currentDate);

            Thread.sleep(1000);

            currentDate = timeServiceImplPort.getCurrentDate();
        }
    }
}
