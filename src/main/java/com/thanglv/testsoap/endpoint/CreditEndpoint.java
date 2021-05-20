package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.CreditRequest;
import vn.mobifone.ocsplatform.CreditResponse;
import vn.mobifone.ocsplatform.ExecuteTaskRequest;
import vn.mobifone.ocsplatform.ExecuteTaskResponse;

import java.io.IOException;

/**
 * @author thanglv on 5/20/2021
 * @project test-soap
 */

@Endpoint
public class CreditEndpoint {

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "CreditRequest")
    @ResponsePayload
    public CreditResponse creditTask(@RequestPayload CreditRequest creditRequest) throws IOException, InterruptedException {
//        System.out.println("REQUEST EXECUTE TASK");
        CreditResponse creditResponse = new CreditResponse();
//        boolean isSessionValid = testService.isSessionValid(executeTaskReq.getSessionId());
//        executeTaskRes.setSessionStatus(isSessionValid ? "SUCCESS REQUEST" : "FAILED REQUEST");
        creditResponse.setResponseStatus("1");
        creditResponse.setDescription("SUCCESS");
        return creditResponse;
    }
}
