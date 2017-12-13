
package introsde.assignment3.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
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

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment3.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/readPersonRequest", output = "http://ws.soap.assignment3.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.UpdatePersonResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/updatePersonRequest", output = "http://ws.soap.assignment3.introsde/People/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.CreatePersonResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/createPersonRequest", output = "http://ws.soap.assignment3.introsde/People/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "delete", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.DeletePersonResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/deletePersonRequest", output = "http://ws.soap.assignment3.introsde/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param personId
     * @param activityType
     * @return
     *     returns java.util.List<introsde.assignment3.soap.ws.Activity>
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferences", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonPreferences")
    @ResponseWrapper(localName = "readPersonPreferencesResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonPreferencesResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/readPersonPreferencesRequest", output = "http://ws.soap.assignment3.introsde/People/readPersonPreferencesResponse")
    public List<Activity> readPersonPreferences(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "activityType", targetNamespace = "")
        String activityType);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment3.soap.ws.Activity>
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "readPreferences", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPreferences")
    @ResponseWrapper(localName = "readPreferencesResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPreferencesResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/readPreferencesRequest", output = "http://ws.soap.assignment3.introsde/People/readPreferencesResponse")
    public List<Activity> readPreferences();

    /**
     * 
     * @param activityId
     * @param personId
     * @return
     *     returns introsde.assignment3.soap.ws.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferencesById", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonPreferencesById")
    @ResponseWrapper(localName = "readPersonPreferencesByIdResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.ReadPersonPreferencesByIdResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/readPersonPreferencesByIdRequest", output = "http://ws.soap.assignment3.introsde/People/readPersonPreferencesByIdResponse")
    public Activity readPersonPreferencesById(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "activityId", targetNamespace = "")
        Long activityId);

    /**
     * 
     * @param activity
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "savePersonPreferences", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.SavePersonPreferences")
    @ResponseWrapper(localName = "savePersonPreferencesResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.SavePersonPreferencesResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/savePersonPreferencesRequest", output = "http://ws.soap.assignment3.introsde/People/savePersonPreferencesResponse")
    public void savePersonPreferences(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "activity", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Activity> activity);

    /**
     * 
     * @param activity
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "updatePersonPreferences", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.UpdatePersonPreferences")
    @ResponseWrapper(localName = "updatePersonPreferencesResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.UpdatePersonPreferencesResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/updatePersonPreferencesRequest", output = "http://ws.soap.assignment3.introsde/People/updatePersonPreferencesResponse")
    public void updatePersonPreferences(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "activity", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Activity> activity);

    /**
     * 
     * @param activity
     * @param personId
     * @param value
     */
    @WebMethod
    @RequestWrapper(localName = "evaluatePersonPreferences", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.EvaluatePersonPreferences")
    @ResponseWrapper(localName = "evaluatePersonPreferencesResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.EvaluatePersonPreferencesResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/evaluatePersonPreferencesRequest", output = "http://ws.soap.assignment3.introsde/People/evaluatePersonPreferencesResponse")
    public void evaluatePersonPreferences(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "activity", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Activity> activity,
        @WebParam(name = "value", targetNamespace = "")
        int value);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<introsde.assignment3.soap.ws.Activity>
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "getBestPersonPreference", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.GetBestPersonPreference")
    @ResponseWrapper(localName = "getBestPersonPreferenceResponse", targetNamespace = "http://ws.soap.assignment3.introsde/", className = "introsde.assignment3.soap.ws.GetBestPersonPreferenceResponse")
    @Action(input = "http://ws.soap.assignment3.introsde/People/getBestPersonPreferenceRequest", output = "http://ws.soap.assignment3.introsde/People/getBestPersonPreferenceResponse")
    public List<Activity> getBestPersonPreference(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

}
