
package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeServiceImpl", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimeServiceImpl {


    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentDate", targetNamespace = "http://soap/", className = "soap.GetCurrentDate")
    @ResponseWrapper(localName = "getCurrentDateResponse", targetNamespace = "http://soap/", className = "soap.GetCurrentDateResponse")
    @Action(input = "http://soap/TimeServiceImpl/getCurrentDateRequest", output = "http://soap/TimeServiceImpl/getCurrentDateResponse")
    public XMLGregorianCalendar getCurrentDate();

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDateAfterFewDays", targetNamespace = "http://soap/", className = "soap.GetDateAfterFewDays")
    @ResponseWrapper(localName = "getDateAfterFewDaysResponse", targetNamespace = "http://soap/", className = "soap.GetDateAfterFewDaysResponse")
    @Action(input = "http://soap/TimeServiceImpl/getDateAfterFewDaysRequest", output = "http://soap/TimeServiceImpl/getDateAfterFewDaysResponse")
    public XMLGregorianCalendar getDateAfterFewDays(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
