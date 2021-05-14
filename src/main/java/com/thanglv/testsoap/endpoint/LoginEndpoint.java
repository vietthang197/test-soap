package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.LoginReq;
import vn.mobifone.ocsplatform.LoginRes;

import java.io.IOException;
import java.util.UUID;

/**
 * @author thanglv on 5/13/2021
 * @project test-soap
 */

@Endpoint
public class LoginEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://ocsplatform.mobifone.vn", localPart = "loginReq")
    @ResponsePayload
    public LoginRes login(@RequestPayload LoginReq loginReq, MessageContext messageContext) throws IOException {
        System.out.println("REQUEST GENERATE SESSIONID");
        LoginRes loginRes = new LoginRes();

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
    }
}
