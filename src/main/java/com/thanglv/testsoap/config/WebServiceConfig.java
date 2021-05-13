package com.thanglv.testsoap.config;

import com.thanglv.testsoap.resolver.DetailSoapFaultDefinitionExceptionResolver;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.server.endpoint.SoapFaultAnnotationExceptionResolver;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import javax.xml.bind.JAXBException;

/**
 * @author thanglv on 5/13/2021
 * @project test-soap
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    public WebServiceConfig(SoapFaultAnnotationExceptionResolver exceptionResolver) {
        exceptionResolver.setOrder(2);
    }

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet dispatcherServlet = new MessageDispatcherServlet();
        dispatcherServlet.setApplicationContext(applicationContext);
        dispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(dispatcherServlet, "/ws/*");
    }

    @Bean
    public DetailSoapFaultDefinitionExceptionResolver exceptionResolver() {
        DetailSoapFaultDefinitionExceptionResolver exceptionResolver =
                new DetailSoapFaultDefinitionExceptionResolver();
        exceptionResolver.setOrder(1);
        return exceptionResolver;
    }


    @Bean(name = "login")
    public DefaultWsdl11Definition messageWsdl11Definition(XsdSchema loginSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setResponseSuffix("Res");
        wsdl11Definition.setRequestSuffix("Req");
        wsdl11Definition.setPortTypeName("LoginPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://ocsplatform.mobifone.vn");
        wsdl11Definition.setSchema(loginSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema loginSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/login.xsd"));
    }

    @Bean
    public Jaxb2Marshaller marshaller() throws JAXBException {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setLazyInit(true);
        marshaller.setContextPath("vn.mobifone.ocsplatform");
        return marshaller;
    }

}
