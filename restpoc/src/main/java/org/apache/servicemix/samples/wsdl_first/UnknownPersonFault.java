
package org.apache.servicemix.samples.wsdl_first;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-09-17T22:42:13.093+05:30
 * Generated source version: 2.7.11
 */

@WebFault(name = "UnknownPersonFault", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types")
public class UnknownPersonFault extends Exception {
    
    private org.apache.servicemix.samples.wsdl_first.types.UnknownPersonFault unknownPersonFault;

    public UnknownPersonFault() {
        super();
    }
    
    public UnknownPersonFault(String message) {
        super(message);
    }
    
    public UnknownPersonFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownPersonFault(String message, org.apache.servicemix.samples.wsdl_first.types.UnknownPersonFault unknownPersonFault) {
        super(message);
        this.unknownPersonFault = unknownPersonFault;
    }

    public UnknownPersonFault(String message, org.apache.servicemix.samples.wsdl_first.types.UnknownPersonFault unknownPersonFault, Throwable cause) {
        super(message, cause);
        this.unknownPersonFault = unknownPersonFault;
    }

    public org.apache.servicemix.samples.wsdl_first.types.UnknownPersonFault getFaultInfo() {
        return this.unknownPersonFault;
    }
}
