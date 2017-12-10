
package introsde.assignment3.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.soap.assignment3.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment3.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonListResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/readPersonListRequest", output = "http://ws.soap.assignment3.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

}
