//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.11 at 12:10:22 PM PKT 
//


package dk.semler.ws.vehiclesalecalculator.v201412.calculateusedvehicle.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RESPONSE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;group ref="{}responseGroup"/&gt;
 *                     &lt;element name="ERROR" type="{}ErrorType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="DTD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="VehicleSaleCalculator" /&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CalculateNewVehicle" /&gt;
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
    "response"
})
@XmlRootElement(name = "MESSAGE")
public class MESSAGE {

    @XmlElement(name = "RESPONSE", required = true)
    protected MESSAGE.RESPONSE response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link MESSAGE.RESPONSE }
     *     
     */
    public MESSAGE.RESPONSE getRESPONSE() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESSAGE.RESPONSE }
     *     
     */
    public void setRESPONSE(MESSAGE.RESPONSE value) {
        this.response = value;
    }

    public MESSAGE withRESPONSE(MESSAGE.RESPONSE value) {
        setRESPONSE(value);
        return this;
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
     *         &lt;choice&gt;
     *           &lt;group ref="{}responseGroup"/&gt;
     *           &lt;element name="ERROR" type="{}ErrorType"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="DTD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="VehicleSaleCalculator" /&gt;
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CalculateNewVehicle" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transactionid",
        "vehicle",
        "calculation",
        "error"
    })
    public static class RESPONSE {

        @XmlElement(name = "TRANSACTIONID")
        protected String transactionid;
        @XmlElement(name = "VEHICLE")
        protected VEHICLEType vehicle;
        @XmlElement(name = "CALCULATION")
        protected CALCULATIONType calculation;
        @XmlElement(name = "ERROR")
        protected ErrorType error;
        @XmlAttribute(name = "DTD", required = true)
        protected String dtd;
        @XmlAttribute(name = "NAME", required = true)
        protected String name;

        /**
         * Gets the value of the transactionid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSACTIONID() {
            return transactionid;
        }

        /**
         * Sets the value of the transactionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSACTIONID(String value) {
            this.transactionid = value;
        }

        /**
         * Gets the value of the vehicle property.
         * 
         * @return
         *     possible object is
         *     {@link VEHICLEType }
         *     
         */
        public VEHICLEType getVEHICLE() {
            return vehicle;
        }

        /**
         * Sets the value of the vehicle property.
         * 
         * @param value
         *     allowed object is
         *     {@link VEHICLEType }
         *     
         */
        public void setVEHICLE(VEHICLEType value) {
            this.vehicle = value;
        }

        /**
         * Gets the value of the calculation property.
         * 
         * @return
         *     possible object is
         *     {@link CALCULATIONType }
         *     
         */
        public CALCULATIONType getCALCULATION() {
            return calculation;
        }

        /**
         * Sets the value of the calculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CALCULATIONType }
         *     
         */
        public void setCALCULATION(CALCULATIONType value) {
            this.calculation = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorType }
         *     
         */
        public ErrorType getERROR() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorType }
         *     
         */
        public void setERROR(ErrorType value) {
            this.error = value;
        }

        /**
         * Gets the value of the dtd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDTD() {
            if (dtd == null) {
                return "VehicleSaleCalculator";
            } else {
                return dtd;
            }
        }

        /**
         * Sets the value of the dtd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDTD(String value) {
            this.dtd = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            if (name == null) {
                return "CalculateNewVehicle";
            } else {
                return name;
            }
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        public MESSAGE.RESPONSE withTRANSACTIONID(String value) {
            setTRANSACTIONID(value);
            return this;
        }

        public MESSAGE.RESPONSE withVEHICLE(VEHICLEType value) {
            setVEHICLE(value);
            return this;
        }

        public MESSAGE.RESPONSE withCALCULATION(CALCULATIONType value) {
            setCALCULATION(value);
            return this;
        }

        public MESSAGE.RESPONSE withERROR(ErrorType value) {
            setERROR(value);
            return this;
        }

        public MESSAGE.RESPONSE withDTD(String value) {
            setDTD(value);
            return this;
        }

        public MESSAGE.RESPONSE withNAME(String value) {
            setNAME(value);
            return this;
        }

    }

}
