package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.DebitRequest;
import vn.mobifone.ocsplatform.DebitResponse;
import vn.mobifone.ocsplatform.ExecuteTaskRequest;
import vn.mobifone.ocsplatform.ExecuteTaskResponse;

import java.io.IOException;

/**
 * @author thanglv on 5/20/2021
 * @project test-soap
 */

@Endpoint
public class DebitEndpoint {

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "DebitRequest")
    @ResponsePayload
    public DebitResponse debitTask(@RequestPayload DebitRequest debitRequest) throws IOException, InterruptedException {
//        System.out.println("REQUEST EXECUTE TASK");
        DebitResponse debitResponse = new DebitResponse();
//        boolean isSessionValid = testService.isSessionValid(executeTaskReq.getSessionId());
//        executeTaskRes.setSessionStatus(isSessionValid ? "SUCCESS REQUEST" : "FAILED REQUEST");
        debitResponse.setDescription("SUCCESS");
        debitResponse.setResponseStatus("1");
        return debitResponse;
    }
}
