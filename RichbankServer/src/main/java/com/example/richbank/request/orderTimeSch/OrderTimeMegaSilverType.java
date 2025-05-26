//
// 此檔案是由 Eclipse Implementation of JAXB, v4.0.5 所產生 
// 請參閱 https://eclipse-ee4j.github.io/jaxb-ri 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//


package com.example.richbank.request.orderTimeSch;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>OrderTimeMegaSilverType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderTimeMegaSilverType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Response" type="{http://richbank.com.example.richbank/}OrderTimeResponseType"/>
 *         <element name="Group" type="{http://richbank.com.example.richbank/}OrderTimeGroupType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTimeMegaSilverType", propOrder = {
    "response",
    "group"
})
public class OrderTimeMegaSilverType {

    @XmlElement(name = "Response", required = true)
    protected OrderTimeResponseType response;
    @XmlElement(name = "Group", required = true)
    protected OrderTimeGroupType group;

    /**
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OrderTimeResponseType }
     *     
     */
    public OrderTimeResponseType getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTimeResponseType }
     *     
     */
    public void setResponse(OrderTimeResponseType value) {
        this.response = value;
    }

    /**
     * 取得 group 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OrderTimeGroupType }
     *     
     */
    public OrderTimeGroupType getGroup() {
        return group;
    }

    /**
     * 設定 group 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTimeGroupType }
     *     
     */
    public void setGroup(OrderTimeGroupType value) {
        this.group = value;
    }

}
