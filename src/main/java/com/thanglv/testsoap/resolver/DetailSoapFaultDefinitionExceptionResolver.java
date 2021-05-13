package com.thanglv.testsoap.resolver;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.server.endpoint.SoapFaultAnnotationExceptionResolver;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;

public class DetailSoapFaultDefinitionExceptionResolver extends SoapFaultAnnotationExceptionResolver {

    public DetailSoapFaultDefinitionExceptionResolver() {
        super();
    }

    @Override
    public void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        SoapFaultDefinition faultDefinition = new SoapFaultDefinition();
        faultDefinition.setFaultCode(SoapFaultDefinition.SERVER);
        faultDefinition.setFaultStringOrReason("ERROR: Lỗi hệ thống");
            setDefaultFault(faultDefinition);
    }


}
