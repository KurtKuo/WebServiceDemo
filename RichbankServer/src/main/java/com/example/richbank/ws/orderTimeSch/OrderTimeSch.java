//
// 此檔案是由 Eclipse Implementation of JAXB, v4.0.5 所產生 
// 請參閱 https://eclipse-ee4j.github.io/jaxb-ri 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//


package com.example.richbank.ws.orderTimeSch;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="WSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txSeq",
    "wsid",
    "id",
    "branch",
    "orderDate"
})
@XmlRootElement(name = "OrderTimeSch")
public class OrderTimeSch {

    @XmlElement(name = "TxSeq", required = true)
    protected String txSeq;
    @XmlElement(name = "WSID", required = true)
    protected String wsid;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Branch", required = true)
    protected String branch;
    @XmlElement(name = "OrderDate")
    protected String orderDate;

    /**
     * 取得 txSeq 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeq() {
        return txSeq;
    }

    /**
     * 設定 txSeq 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSeq(String value) {
        this.txSeq = value;
    }

    /**
     * 取得 wsid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSID() {
        return wsid;
    }

    /**
     * 設定 wsid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSID(String value) {
        this.wsid = value;
    }

    /**
     * 取得 id 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 設定 id 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 取得 branch 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 設定 branch 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * 取得 orderDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 設定 orderDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

}
