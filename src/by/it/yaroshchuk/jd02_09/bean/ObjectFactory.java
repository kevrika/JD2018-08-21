//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.10.13 at 02:43:05 PM MSK 
//


package by.it.yaroshchuk.jd02_09.bean;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.it.yaroshchuk.jd02_09.bean package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.it.yaroshchuk.jd02_09.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Resumes }
     * 
     */
    public Resumes createResumes() {
        return new Resumes();
    }

    /**
     * Create an instance of {@link Resume }
     * 
     */
    public Resume createResume() {
        return new Resume();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Education }
     * 
     */
    public Education createEducation() {
        return new Education();
    }

    /**
     * Create an instance of {@link Experience }
     * 
     */
    public Experience createExperience() {
        return new Experience();
    }

}
