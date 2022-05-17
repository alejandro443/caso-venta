
package pe.edu.upeu.soap.ws.daoImpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import pe.edu.upeu.soap.ws.dao.Alumno;
import pe.edu.upeu.soap.ws.dao.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlumnoDao", targetNamespace = "http://dao.ws.soap.upeu.edu.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlumnoDao {


    /**
     * 
     * @param arg0
     * @return
     *     returns pe.edu.upeu.soap.ws.dao.Alumno
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAlumno", targetNamespace = "http://dao.ws.soap.upeu.edu.pe/", className = "pe.edu.upeu.soap.ws.dao.ReadAlumno")
    @ResponseWrapper(localName = "readAlumnoResponse", targetNamespace = "http://dao.ws.soap.upeu.edu.pe/", className = "pe.edu.upeu.soap.ws.dao.ReadAlumnoResponse")
    @Action(input = "http://dao.ws.soap.upeu.edu.pe/AlumnoDao/readAlumnoRequest", output = "http://dao.ws.soap.upeu.edu.pe/AlumnoDao/readAlumnoResponse")
    public Alumno readAlumno(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
