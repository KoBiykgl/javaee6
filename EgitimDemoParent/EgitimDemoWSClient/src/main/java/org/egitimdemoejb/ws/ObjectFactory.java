
package org.egitimdemoejb.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.egitimdemoejb.ws package. 
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

    private final static QName _GetGendersResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getGendersResponse");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getStudentsResponse");
    private final static QName _RemoveStudent_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "removeStudent");
    private final static QName _AddStudent_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "addStudent");
    private final static QName _GetStudents_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getStudents");
    private final static QName _GetCounties_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getCounties");
    private final static QName _GetCountiesResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getCountiesResponse");
    private final static QName _GetCitiesResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getCitiesResponse");
    private final static QName _AddStudentResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "addStudentResponse");
    private final static QName _GetGenders_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getGenders");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "removeStudentResponse");
    private final static QName _GetCities_QNAME = new QName("http://ws.EgitimDemoEjb.org/", "getCities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.egitimdemoejb.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link GetCounties }
     * 
     */
    public GetCounties createGetCounties() {
        return new GetCounties();
    }

    /**
     * Create an instance of {@link GetCountiesResponse }
     * 
     */
    public GetCountiesResponse createGetCountiesResponse() {
        return new GetCountiesResponse();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link Gender }
     * 
     */
    public Gender createGender() {
        return new Gender();
    }

    /**
     * Create an instance of {@link County }
     * 
     */
    public County createCounty() {
        return new County();
    }

    /**
     * Create an instance of {@link GetGendersResponse }
     * 
     */
    public GetGendersResponse createGetGendersResponse() {
        return new GetGendersResponse();
    }

    /**
     * Create an instance of {@link GetCitiesResponse }
     * 
     */
    public GetCitiesResponse createGetCitiesResponse() {
        return new GetCitiesResponse();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link GetCities }
     * 
     */
    public GetCities createGetCities() {
        return new GetCities();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link GetGenders }
     * 
     */
    public GetGenders createGetGenders() {
        return new GetGenders();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getGendersResponse")
    public JAXBElement<GetGendersResponse> createGetGendersResponse(GetGendersResponse value) {
        return new JAXBElement<GetGendersResponse>(_GetGendersResponse_QNAME, GetGendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "removeStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCounties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getCounties")
    public JAXBElement<GetCounties> createGetCounties(GetCounties value) {
        return new JAXBElement<GetCounties>(_GetCounties_QNAME, GetCounties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getCountiesResponse")
    public JAXBElement<GetCountiesResponse> createGetCountiesResponse(GetCountiesResponse value) {
        return new JAXBElement<GetCountiesResponse>(_GetCountiesResponse_QNAME, GetCountiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getCitiesResponse")
    public JAXBElement<GetCitiesResponse> createGetCitiesResponse(GetCitiesResponse value) {
        return new JAXBElement<GetCitiesResponse>(_GetCitiesResponse_QNAME, GetCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getGenders")
    public JAXBElement<GetGenders> createGetGenders(GetGenders value) {
        return new JAXBElement<GetGenders>(_GetGenders_QNAME, GetGenders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "removeStudentResponse")
    public JAXBElement<RemoveStudentResponse> createRemoveStudentResponse(RemoveStudentResponse value) {
        return new JAXBElement<RemoveStudentResponse>(_RemoveStudentResponse_QNAME, RemoveStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.EgitimDemoEjb.org/", name = "getCities")
    public JAXBElement<GetCities> createGetCities(GetCities value) {
        return new JAXBElement<GetCities>(_GetCities_QNAME, GetCities.class, null, value);
    }

}
