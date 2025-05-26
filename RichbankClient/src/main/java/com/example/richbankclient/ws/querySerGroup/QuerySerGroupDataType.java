//
// 此檔案是由 Eclipse Implementation of JAXB, v4.0.5 所產生 
// 請參閱 https://eclipse-ee4j.github.io/jaxb-ri 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//


package com.example.richbankclient.ws.querySerGroup;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>QuerySerGroupDataType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="QuerySerGroupDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySerGroupDataType", propOrder = {
    "groupID",
    "name"
})
public class QuerySerGroupDataType {

    @XmlElement(name = "GroupID", required = true)
    protected String groupID;
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * 取得 groupID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * 設定 groupID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
