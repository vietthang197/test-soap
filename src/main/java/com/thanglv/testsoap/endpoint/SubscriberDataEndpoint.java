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
public class SubscriberDataEndpoint extends BaseEndpoint {

    @PayloadRoot(namespace = "http://alcatel-lucent.com/esm/ws/svcmgr/V2_0", localPart = "RetrieveRequest")
    @ResponsePayload
    public RetrieveResponse subscriberData(@RequestPayload RetrieveRequest retrieveRequest, MessageContext messageContext) throws IOException, InterruptedException {

//        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
//        SaajSoapMessage saajSoapMessageReq = (SaajSoapMessage) messageContext.getRequest();
//
//        alterSoapEnvelope(saajSoapMessage);
//        alterSoapEnvelope(saajSoapMessageReq);

        try {
            RetrieveResponse retrieveResponse = new RetrieveResponse();
            retrieveResponse.setRequestInfo(new RetrieveResponse.RequestInfo(){{
                setReqID("REQUEST_ID-1234321");
            }});
            retrieveResponse.setResult("SUCCESS");

            RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList paramList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList();

            String fakeRes = "msisdn=782974780,ppm_id=782974780,ACCOUNID=1073874186,MSISDN=782974780,IDENTIFY=782974780,IMSI=452019949985426,SERVRET=sdpprov,BIRTHDAY=,COFFDATE=,COFFNAME=,CUG=,EMAIL=,FF_GROUP=,FIRSTNAM=,INFO1=19/07/2021,INFO2=,LANGCUR=Vietnamese,CITY_LOC=,LOGIN=782974780,LSCEPOOL=,MARKIND=2,MN30=,MSIDTYPE=1,NOVAT_F=1,OPER_FLG=0,PASSWD=,PIN_NBR=,SEP_GRP=creactor-P4,PROFILE=FCT2,ACCREDDT=09/05/2021 10:47:08,D_TAC=09/05/2021 10:47:07,D_TMC=09/07/2021 23:59:59,A_LOCK=0,A_EMPTY=0,ADMISL=0,ADMISTAT=0,ADMNMCR=0,ADMPBLK=0,ADMPFEE=0,ADMPIBLK=0,ADMSCRS=0,A_CURSTA=2,FIRSTCAL=1,D_TR=18/08/2021 23:59:59,D_TB1=09/05/2021 10:47:08,D_TBE=05/11/2021 10:47:08,GLBADPIN=0,GLBADPWD=0,N_REFILL=0,LACTDON2=0,LACDONE=0,LCWDONE=0,LCWDONE2=0,LINACDO2=0,LINACDON=0,LSTFEEDT=,LSTRELDT=10/05/2021 06:06:33,LSTRELVA=50000,LSTUPCDT=10/05/2021 06:06:33,NBBADPIN=0,NBBADPWD=0,REFILL_E=0,NDATDIS=,NDATFEE=,PREPAID=1,TCBLOCK=0,TCRELOSS=0,CREDIT=50000,VAT_VOL=0,WLCDONE=1,AMOUNT=50000&0&0&0&0&0&0&0&0&0,DATE_CAL=10/05/2021&&&&&&&&&,DESTINAT=GTP_REFILL_F&&&&&&&&&,TIME_CAL=06:06:33&&&&&&&&&,TYPE_CAL=2&0&0&0&0&0&0&0&0&0,CALL_DUR=0&0&0&0&0&0&0&0&0&0,SRVOFF=5000000&&&&&&&&&,TIDX=1,TMD=10/05/2021,LCD=24/11/2009,TF=0,BDD=02/11/2009,FDT=0,BEEN=0,ALLOWP2P=1,WDD=02/11/2009,INA=0,D_TIN=19/07/2021,RAT_IDX1=2,LWD=02/11/2009,LBD=02/11/2009,BCH=0,HLR=0,TINDATE=10/10/1990,W=NULL,NA=1,IVC_F=-1,NSF=1,NSE=0,SC_NUM=41250101612356087,RAT_IDX=1,Z=NULL,IVF=-1,Y=NULL,X=NULL";
            String[] arrData = fakeRes.split(",");
            for (String item : arrData) {
                vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param param = new vn.mobifone.ocsplatform.RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList.ParamList.Param(){{
                    String[] itemValue = item.split("=");
                    setName(itemValue[0]);
                    setValue(itemValue.length > 1 ? itemValue[1] : "");
                }};
                paramList.getParam().add(param);
            }

            RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList recordList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection.RecordList();
            recordList.getParamList().add(paramList);

            RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection collection = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList.Collection();
            collection.setRecordList(recordList);
            collection.setCollectionName("Balance");

            RetrieveResponse.TaskResponseList.TaskResponse.CollectionList collectionList = new RetrieveResponse.TaskResponseList.TaskResponse.CollectionList();
            collectionList.getCollection().add(collection);

            RetrieveResponse.TaskResponseList.TaskResponse taskResponse = new RetrieveResponse.TaskResponseList.TaskResponse();
            taskResponse.setName("Query All Subscriber Data");
            taskResponse.setResult("SUCCESS");
            RetrieveResponse.TaskResponseList.TaskResponse.ErrorInfo errorInfo = new RetrieveResponse.TaskResponseList.TaskResponse.ErrorInfo(){{
                setErrorCode(0);
            }};
            taskResponse.setErrorInfo(errorInfo);
            taskResponse.setCollectionList(collectionList);

            RetrieveResponse.TaskResponseList taskResponseList = new RetrieveResponse.TaskResponseList();
            taskResponseList.getTaskResponse().add(taskResponse);
            retrieveResponse.setTaskResponseList(taskResponseList);
            return retrieveResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
