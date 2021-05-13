package com.thanglv.testsoap.endpoint;

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

    @PayloadRoot(namespace = "http://ocsplatform.mobifone.vn", localPart = "loginReq")
    @ResponsePayload
    public LoginRes login(@RequestPayload LoginReq loginReq, MessageContext messageContext) throws IOException {
        System.out.println("REQUEST GENERATE SESSIONID");
        LoginRes loginRes = new LoginRes();
        loginRes.setResponseStatus("1");
        loginRes.setDescription("SUCCESS");
        loginRes.setSessionID(UUID.randomUUID().toString());
        return loginRes;
    }
}
