package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import vn.mobifone.ocsplatform.KeepAliveRequest;
import vn.mobifone.ocsplatform.KeepAliveResponse;

import java.io.IOException;

/**
 * @author thanglv on 5/14/2021
 * @project test-soap
 */

@Endpoint
public class KeepAliveEndpoint extends BaseEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "KeepAliveRequest")
    @ResponsePayload
    public KeepAliveResponse keepAlive(@RequestPayload KeepAliveRequest keepAliveRequest, MessageContext messageContext) throws IOException, InterruptedException {
        System.out.println("REQUEST KEEP ALIVE SESSIONID");

        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
        alterSoapEnvelope(saajSoapMessage);

        KeepAliveResponse keepAlivekRes = new KeepAliveResponse();
        boolean status = testService.keepAliveSession(keepAliveRequest.getSessionIdKeep());
        keepAlivekRes.setSessionId(keepAliveRequest.getSessionIdKeep());
        if (status) {
            keepAlivekRes.setSessionStatusKeep("1");
        } else {
            keepAlivekRes.setSessionStatusKeep("0");
        }
        return keepAlivekRes;
    }
}
