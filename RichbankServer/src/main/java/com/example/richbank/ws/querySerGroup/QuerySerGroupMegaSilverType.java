//
// 此檔案是由 Eclipse Implementation of JAXB, v4.0.5 所產生 
// 請參閱 https://eclipse-ee4j.github.io/jaxb-ri 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//


package com.example.richbank.ws.querySerGroup;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>QuerySerGroupMegaSilverType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="QuerySerGroupMegaSilverType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Response" type="{http://richbank.com.example.richbank/}QuerySerGroupResponseType"/>
 *         <element name="Group" type="{http://richbank.com.example.richbank/}QuerySerGroupGroupType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySerGroupMegaSilverType", propOrder = {
    "response",
    "group"
})
public class QuerySerGroupMegaSilverType {

    @XmlElement(name = "Response", required = true)
    protected QuerySerGroupResponseType response;
    @XmlElement(name = "Group", required = true)
    protected QuerySerGroupGroupType group;

    /**
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuerySerGroupResponseType }
     *     
     */
    public QuerySerGroupResponseType getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySerGroupResponseType }
     *     
     */
    public void setResponse(QuerySerGroupResponseType value) {
        this.response = value;
    }

    /**
     * 取得 group 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuerySerGroupGroupType }
     *     
     */
    public QuerySerGroupGroupType getGroup() {
        return group;
    }

    /**
     * 設定 group 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySerGroupGroupType }
     *     
     */
    public void setGroup(QuerySerGroupGroupType value) {
        this.group = value;
    }

}
