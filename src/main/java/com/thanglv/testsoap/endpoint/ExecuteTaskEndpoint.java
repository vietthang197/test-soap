package com.thanglv.testsoap.endpoint;

import com.thanglv.testsoap.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import vn.mobifone.ocsplatform.ExecuteTaskRequest;
import vn.mobifone.ocsplatform.ExecuteTaskResponse;

import java.io.IOException;

/**
 * @author thanglv on 5/14/2021
 * @project test-soap
 */
@Endpoint
public class ExecuteTaskEndpoint extends BaseEndpoint {

    @Autowired
    private TestService testService;

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "ExecuteTaskRequest")
    @ResponsePayload
    public ExecuteTaskResponse executeTask(@RequestPayload ExecuteTaskRequest executeTaskRequest) throws IOException, InterruptedException {
//        System.out.println("REQUEST EXECUTE TASK");
        ExecuteTaskResponse executeTaskRes = new ExecuteTaskResponse();
//        boolean isSessionValid = testService.isSessionValid(executeTaskReq.getSessionId());
//        executeTaskRes.setSessionStatus(isSessionValid ? "SUCCESS REQUEST" : "FAILED REQUEST");
        Thread.sleep(1000);
        executeTaskRes.setResultMessage(executeTaskRequest.getSessionId());
        executeTaskRes.setSessionStatus("1");
        return executeTaskRes;
    }
}
