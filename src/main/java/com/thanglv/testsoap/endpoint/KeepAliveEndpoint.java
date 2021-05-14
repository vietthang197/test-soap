package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.KeepAliveReq;
import vn.mobifone.ocsplatform.KeepAliveRes;

import java.io.IOException;

/**
 * @author thanglv on 5/14/2021
 * @project test-soap
 */

@Endpoint
public class KeepAliveEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://ocsplatform.mobifone.vn", localPart = "keepAliveReq")
    @ResponsePayload
    public KeepAliveRes keepAlive(@RequestPayload KeepAliveReq keepAliveReq, MessageContext messageContext) throws IOException, InterruptedException {
        System.out.println("REQUEST KEEP ALIVE SESSIONID");
        KeepAliveRes keepAlivekRes = new KeepAliveRes();
        boolean status = testService.keepAliveSession(keepAliveReq.getSessionIdKeep());
        keepAlivekRes.setSessionId(keepAliveReq.getSessionIdKeep());
        if (status) {
            keepAlivekRes.setSessionStatusKeep("1");
        } else {
            keepAlivekRes.setSessionStatusKeep("0");
        }
        return keepAlivekRes;
    }
}
