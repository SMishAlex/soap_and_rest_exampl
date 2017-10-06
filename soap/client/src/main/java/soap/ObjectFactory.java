
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDateAfterFewDays_QNAME = new QName("http://soap/", "getDateAfterFewDays");
    private final static QName _GetDateAfterFewDaysResponse_QNAME = new QName("http://soap/", "getDateAfterFewDaysResponse");
    private final static QName _GetCurrentDate_QNAME = new QName("http://soap/", "getCurrentDate");
    private final static QName _GetCurrentDateResponse_QNAME = new QName("http://soap/", "getCurrentDateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDateAfterFewDaysResponse }
     * 
     */
    public GetDateAfterFewDaysResponse createGetDateAfterFewDaysResponse() {
        return new GetDateAfterFewDaysResponse();
    }

    /**
     * Create an instance of {@link GetCurrentDate }
     * 
     */
    public GetCurrentDate createGetCurrentDate() {
        return new GetCurrentDate();
    }

    /**
     * Create an instance of {@link GetCurrentDateResponse }
     * 
     */
    public GetCurrentDateResponse createGetCurrentDateResponse() {
        return new GetCurrentDateResponse();
    }

    /**
     * Create an instance of {@link GetDateAfterFewDays }
     * 
     */
    public GetDateAfterFewDays createGetDateAfterFewDays() {
        return new GetDateAfterFewDays();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateAfterFewDays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getDateAfterFewDays")
    public JAXBElement<GetDateAfterFewDays> createGetDateAfterFewDays(GetDateAfterFewDays value) {
        return new JAXBElement<GetDateAfterFewDays>(_GetDateAfterFewDays_QNAME, GetDateAfterFewDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateAfterFewDaysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getDateAfterFewDaysResponse")
    public JAXBElement<GetDateAfterFewDaysResponse> createGetDateAfterFewDaysResponse(GetDateAfterFewDaysResponse value) {
        return new JAXBElement<GetDateAfterFewDaysResponse>(_GetDateAfterFewDaysResponse_QNAME, GetDateAfterFewDaysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCurrentDate")
    public JAXBElement<GetCurrentDate> createGetCurrentDate(GetCurrentDate value) {
        return new JAXBElement<GetCurrentDate>(_GetCurrentDate_QNAME, GetCurrentDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCurrentDateResponse")
    public JAXBElement<GetCurrentDateResponse> createGetCurrentDateResponse(GetCurrentDateResponse value) {
        return new JAXBElement<GetCurrentDateResponse>(_GetCurrentDateResponse_QNAME, GetCurrentDateResponse.class, null, value);
    }

}
