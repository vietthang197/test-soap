//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.20 at 11:58:51 AM ICT 
//


package vn.mobifone.ocsplatform;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NERoutingInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NeGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DistributionKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaskList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Task"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="QueryCriteria"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionInfo",
    "requestInfo",
    "neRoutingInfo",
    "taskList"
})
@XmlRootElement(name = "RetrieveRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
public class RetrieveRequest {

    @XmlElement(name = "SessionInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    protected RetrieveRequest.SessionInfo sessionInfo;
    @XmlElement(name = "RequestInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    protected RetrieveRequest.RequestInfo requestInfo;
    @XmlElement(name = "NERoutingInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    protected RetrieveRequest.NERoutingInfo neRoutingInfo;
    @XmlElement(name = "TaskList", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    protected RetrieveRequest.TaskList taskList;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest.SessionInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public RetrieveRequest.SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest.SessionInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public void setSessionInfo(RetrieveRequest.SessionInfo value) {
        this.sessionInfo = value;
    }

    /**
     * Gets the value of the requestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest.RequestInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public RetrieveRequest.RequestInfo getRequestInfo() {
        return requestInfo;
    }

    /**
     * Sets the value of the requestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest.RequestInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public void setRequestInfo(RetrieveRequest.RequestInfo value) {
        this.requestInfo = value;
    }

    /**
     * Gets the value of the neRoutingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest.NERoutingInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public RetrieveRequest.NERoutingInfo getNERoutingInfo() {
        return neRoutingInfo;
    }

    /**
     * Sets the value of the neRoutingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest.NERoutingInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public void setNERoutingInfo(RetrieveRequest.NERoutingInfo value) {
        this.neRoutingInfo = value;
    }

    /**
     * Gets the value of the taskList property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest.TaskList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public RetrieveRequest.TaskList getTaskList() {
        return taskList;
    }

    /**
     * Sets the value of the taskList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest.TaskList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public void setTaskList(RetrieveRequest.TaskList value) {
        this.taskList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NeGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DistributionKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "neGroupName",
        "distributionKey"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public static class NERoutingInfo {

        @XmlElement(name = "NeGroupName", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        protected String neGroupName;
        @XmlElement(name = "DistributionKey", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        protected String distributionKey;

        /**
         * Gets the value of the neGroupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public String getNeGroupName() {
            return neGroupName;
        }

        /**
         * Sets the value of the neGroupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public void setNeGroupName(String value) {
            this.neGroupName = value;
        }

        /**
         * Gets the value of the distributionKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public String getDistributionKey() {
            return distributionKey;
        }

        /**
         * Sets the value of the distributionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public void setDistributionKey(String value) {
            this.distributionKey = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ReqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reqID"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public static class RequestInfo {

        @XmlElement(name = "ReqID", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        protected String reqID;

        /**
         * Gets the value of the reqID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public String getReqID() {
            return reqID;
        }

        /**
         * Sets the value of the reqID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public void setReqID(String value) {
            this.reqID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionId"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public static class SessionInfo {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        protected String sessionId;

        /**
         * Gets the value of the sessionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public String getSessionId() {
            return sessionId;
        }

        /**
         * Sets the value of the sessionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public void setSessionId(String value) {
            this.sessionId = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Task"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="QueryCriteria"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "task"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
    public static class TaskList {

        @XmlElement(name = "Task", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        protected RetrieveRequest.TaskList.Task task;

        /**
         * Gets the value of the task property.
         * 
         * @return
         *     possible object is
         *     {@link RetrieveRequest.TaskList.Task }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public RetrieveRequest.TaskList.Task getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrieveRequest.TaskList.Task }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public void setTask(RetrieveRequest.TaskList.Task value) {
            this.task = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="QueryCriteria"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "queryCriteria"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
        public static class Task {

            @XmlElement(name = "Name", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            protected String name;
            @XmlElement(name = "QueryCriteria", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            protected RetrieveRequest.TaskList.Task.QueryCriteria queryCriteria;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the queryCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link RetrieveRequest.TaskList.Task.QueryCriteria }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            public RetrieveRequest.TaskList.Task.QueryCriteria getQueryCriteria() {
                return queryCriteria;
            }

            /**
             * Sets the value of the queryCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrieveRequest.TaskList.Task.QueryCriteria }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            public void setQueryCriteria(RetrieveRequest.TaskList.Task.QueryCriteria value) {
                this.queryCriteria = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Param" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
            public static class QueryCriteria {

                @XmlElement(name = "Param")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                protected List<RetrieveRequest.TaskList.Task.QueryCriteria.Param> param;

                /**
                 * Gets the value of the param property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the param property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParam().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RetrieveRequest.TaskList.Task.QueryCriteria.Param }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                public List<RetrieveRequest.TaskList.Task.QueryCriteria.Param> getParam() {
                    if (param == null) {
                        param = new ArrayList<RetrieveRequest.TaskList.Task.QueryCriteria.Param>();
                    }
                    return this.param;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name",
                    "value"
                })
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                public static class Param {

                    @XmlElement(name = "Name", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    protected String name;
                    @XmlElement(name = "Value", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    protected String value;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-05-20T11:58:51+07:00", comments = "JAXB RI v2.3.2")
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }

    }

}
