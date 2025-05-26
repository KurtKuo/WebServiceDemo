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
 * <p>OrderTimeDataType complex type 的 Java 類別.</p>
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderTimeDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OrderSTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OrderETime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CurrentCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MaxCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTimeDataType", propOrder = {
    "orderDate",
    "orderSTime",
    "orderETime",
    "currentCnt",
    "maxCnt"
})
public class OrderTimeDataType {

    @XmlElement(name = "OrderDate", required = true)
    protected String orderDate;
    @XmlElement(name = "OrderSTime", required = true)
    protected String orderSTime;
    @XmlElement(name = "OrderETime", required = true)
    protected String orderETime;
    @XmlElement(name = "CurrentCnt")
    protected int currentCnt;
    @XmlElement(name = "MaxCnt")
    protected int maxCnt;

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

    /**
     * 取得 orderSTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSTime() {
        return orderSTime;
    }

    /**
     * 設定 orderSTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSTime(String value) {
        this.orderSTime = value;
    }

    /**
     * 取得 orderETime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderETime() {
        return orderETime;
    }

    /**
     * 設定 orderETime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderETime(String value) {
        this.orderETime = value;
    }

    /**
     * 取得 currentCnt 特性的值.
     * 
     */
    public int getCurrentCnt() {
        return currentCnt;
    }

    /**
     * 設定 currentCnt 特性的值.
     * 
     */
    public void setCurrentCnt(int value) {
        this.currentCnt = value;
    }

    /**
     * 取得 maxCnt 特性的值.
     * 
     */
    public int getMaxCnt() {
        return maxCnt;
    }

    /**
     * 設定 maxCnt 特性的值.
     * 
     */
    public void setMaxCnt(int value) {
        this.maxCnt = value;
    }

}
