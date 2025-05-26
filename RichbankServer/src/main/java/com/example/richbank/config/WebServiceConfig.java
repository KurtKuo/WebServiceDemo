package com.example.richbank.config;

import java.util.Map;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import jakarta.xml.bind.Marshaller;

@EnableWs
@Configuration
public class WebServiceConfig {

	private static final String NAMESPACE_URI = "http://richbank.com.example.richbank/";

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/richbankService/*");
    }

    /**
     * 主 schema，包含其他 xsd。
     */
    @Bean
    public XsdSchema richbankSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/richbank.xsd"));
    }

    /**
     * 建立 WSDL 定義，只註冊一個入口。
     */
    @Bean(name = "richbank")
    public DefaultWsdl11Definition richbankWsdl(XsdSchema richbankSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("RichbankPort");
        wsdl.setLocationUri("/richbankService");
        wsdl.setTargetNamespace(NAMESPACE_URI);
        wsdl.setSchema(richbankSchema);
        return wsdl;
    }
}
