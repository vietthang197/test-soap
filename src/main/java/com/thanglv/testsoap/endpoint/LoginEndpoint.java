package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import vn.mobifone.ocsplatform.LoginRequest;
import vn.mobifone.ocsplatform.LoginResponse;

import java.io.IOException;
import java.util.UUID;

/**
 * @author thanglv on 5/13/2021
 * @project test-soap
 */

@Endpoint
public class LoginEndpoint extends BaseEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "LoginRequest")
    @ResponsePayload
    public LoginResponse login(@RequestPayload LoginRequest loginRequest, MessageContext messageContext) throws IOException {
        try {
            System.out.println("REQUEST GENERATE SESSIONID");

//            SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
//            alterSoapEnvelope(saajSoapMessage);

            LoginResponse loginRes = new LoginResponse();

            String session = testService.genSession();
            if (session == null) {
                loginRes.setResponseStatus("0");
                loginRes.setDescription("MAX SESSION CREATED!");
            } else {
                loginRes.setResponseStatus("1");
                loginRes.setDescription("SUCCESS");
                loginRes.setSessionID(session);
            }
            return loginRes;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
