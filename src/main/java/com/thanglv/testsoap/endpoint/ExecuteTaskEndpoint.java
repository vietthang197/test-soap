package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.ExecuteTaskReq;
import vn.mobifone.ocsplatform.ExecuteTaskRes;
import vn.mobifone.ocsplatform.LoginReq;
import vn.mobifone.ocsplatform.LoginRes;

import java.io.IOException;
import java.util.UUID;

/**
 * @author thanglv on 5/14/2021
 * @project test-soap
 */
@Endpoint
public class ExecuteTaskEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://ocsplatform.mobifone.vn", localPart = "executeTaskReq")
    @ResponsePayload
    public ExecuteTaskRes executeTask(@RequestPayload ExecuteTaskReq executeTaskReq, MessageContext messageContext) throws IOException, InterruptedException {
//        System.out.println("REQUEST EXECUTE TASK");
        ExecuteTaskRes executeTaskRes = new ExecuteTaskRes();
//        boolean isSessionValid = testService.isSessionValid(executeTaskReq.getSessionId());
//        executeTaskRes.setSessionStatus(isSessionValid ? "SUCCESS REQUEST" : "FAILED REQUEST");
        Thread.sleep(2000);
        executeTaskRes.setResultMessage(executeTaskReq.getSessionId());
        executeTaskRes.setSessionStatus("1");
        return executeTaskRes;
    }
}
