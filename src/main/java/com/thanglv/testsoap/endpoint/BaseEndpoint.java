package com.thanglv.testsoap.endpoint;

import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.soap.*;

/**
 * @author thanglv on 5/20/2021
 * @project test-soap
 */
public abstract class BaseEndpoint {
    protected void alterSoapEnvelope(SaajSoapMessage soapResponse) {
        try {
            SOAPMessage soapMessage = soapResponse.getSaajMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPHeader header = soapMessage.getSOAPHeader();
            SOAPBody body = soapMessage.getSOAPBody();
            SOAPFault fault = body.getFault();
            envelope.removeNamespaceDeclaration(envelope.getPrefix());
            envelope.setPrefix("S");
            header.setPrefix("S");
            body.setPrefix("S");

            if (fault != null) {
                fault.setPrefix("S");
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
