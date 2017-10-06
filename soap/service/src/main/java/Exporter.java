import soap.TimeServiceImpl;

import javax.xml.ws.Endpoint;

public class Exporter {
    /**
     * Make service available on localhost.
     *
     * You can find wsdl on http://localhost:8080/some?wsdl
     * use folowing code from others project path to generate client:
     * {@code wsimport -keep -verbose -s ./src/ http://localhost:8080/some?wsdl}
     * @param args
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/some",
                new TimeServiceImpl());
    }
}
