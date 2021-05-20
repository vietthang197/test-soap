package com.thanglv.testsoap.endpoint;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import vn.mobifone.ocsplatform.RetrieveRequest;
import vn.mobifone.ocsplatform.RetrieveResponse;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author thanglv on 5/20/2021
 * @project test-soap
 */

@Endpoint
public class SubscriberDataEndpoint {

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "RetrieveRequest")
    @ResponsePayload
    public RetrieveResponse subscriberData(@RequestPayload RetrieveRequest retrieveRequest, MessageContext messageContext) throws IOException, InterruptedException {

        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
        SaajSoapMessage saajSoapMessageReq = (SaajSoapMessage) messageContext.getRequest();

        alterSoapEnvelope(saajSoapMessage);
        alterSoapEnvelope(saajSoapMessageReq);

        RetrieveResponse retrieveResponse = new RetrieveResponse();
        retrieveResponse.setRequestInfo(new RetrieveResponse.RequestInfo(){{
            setReqID("REQUEST_ID-1234321 hình như anh đã say em rồi!");
        }});
        retrieveResponse.setResult("SUCCESS");

        vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param param = new vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param(){{
            setName("Account ID");
            setValue("84764229250");
        }};
        vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param param1 = new vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param(){{
            setName("Primary Balance");
            setValue("25011324");
        }};

        vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param param2 = new
                vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param(){{
            setName("Secondary Balance");
            setValue("0");
        }};

        vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param param3 = new vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param(){{
            setName("Account in Use");
            setValue("0");
        }};

        RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList paramList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList();
        paramList.getParam().add(param);
        paramList.getParam().add(param1);
        paramList.getParam().add(param2);
        paramList.getParam().add(param3);

        RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList recordList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList();
        recordList.setParamList(paramList);

        RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection collection = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection();
        collection.setRecordList(recordList);
        collection.setCollectionName("Balance");

        RetrieveResponse.TaskResponseList.TaskResponse.CollectionList collectionList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList();
        collectionList.setCollection(collection);

        RetrieveResponse.TaskResponseList.TaskResponse taskResponse = new RetrieveResponse.TaskResponseList.TaskResponse();
        taskResponse.setName("Query All Subscriber Data");
        taskResponse.setResult("SUCCESS");
        RetrieveResponse.TaskResponseList.TaskResponse.ErrorInfo errorInfo = new RetrieveResponse.TaskResponseList.TaskResponse.ErrorInfo(){{
            setErrorCode(0);
        }};
        taskResponse.setErrorInfo(errorInfo);
        taskResponse.setCollectionList(collectionList);

        RetrieveResponse.TaskResponseList taskResponseList = new RetrieveResponse.TaskResponseList();
        taskResponseList.setTaskResponse(taskResponse);
        retrieveResponse.setTaskResponseList(taskResponseList);
        return retrieveResponse;
    }

    private void alterSoapEnvelope(SaajSoapMessage soapResponse) {
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
