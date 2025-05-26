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
 * <p>QuerySerGroupResultType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="QuerySerGroupResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MegaSilver" type="{http://richbank.com.example.richbank/}QuerySerGroupMegaSilverType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySerGroupResultType", propOrder = {
    "megaSilver"
})
public class QuerySerGroupResultType {

    @XmlElement(name = "MegaSilver", required = true)
    protected QuerySerGroupMegaSilverType megaSilver;

    /**
     * 取得 megaSilver 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuerySerGroupMegaSilverType }
     *     
     */
    public QuerySerGroupMegaSilverType getMegaSilver() {
        return megaSilver;
    }

    /**
     * 設定 megaSilver 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySerGroupMegaSilverType }
     *     
     */
    public void setMegaSilver(QuerySerGroupMegaSilverType value) {
        this.megaSilver = value;
    }

}
