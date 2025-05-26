//
// 此檔案是由 Eclipse Implementation of JAXB, v4.0.5 所產生 
// 請參閱 https://eclipse-ee4j.github.io/jaxb-ri 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//


package com.example.richbankclient.ws.orderTimeSch;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>OrderTimeResponseType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderTimeResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TxSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Over" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTimeResponseType", propOrder = {
    "code",
    "desc",
    "txSeq",
    "dateTime",
    "over"
})
public class OrderTimeResponseType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "TxSeq", required = true)
    protected String txSeq;
    @XmlElement(name = "DateTime", required = true)
    protected String dateTime;
    @XmlElement(name = "Over")
    protected int over;

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 取得 desc 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 設定 desc 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

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
     * 取得 dateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 設定 dateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * 取得 over 特性的值.
     * 
     */
    public int getOver() {
        return over;
    }

    /**
     * 設定 over 特性的值.
     * 
     */
    public void setOver(int value) {
        this.over = value;
    }

}
