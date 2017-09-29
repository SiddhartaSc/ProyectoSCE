
package example.hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsMensaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsMensaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blnRes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="intRes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strCadenaResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsMensaje", propOrder = {
    "blnRes",
    "intRes",
    "strCadenaResultado"
})
public class ClsMensaje {

    protected boolean blnRes;
    protected int intRes;
    protected String strCadenaResultado;

    /**
     * Obtiene el valor de la propiedad blnRes.
     * 
     */
    public boolean isBlnRes() {
        return blnRes;
    }

    /**
     * Define el valor de la propiedad blnRes.
     * 
     */
    public void setBlnRes(boolean value) {
        this.blnRes = value;
    }

    /**
     * Obtiene el valor de la propiedad intRes.
     * 
     */
    public int getIntRes() {
        return intRes;
    }

    /**
     * Define el valor de la propiedad intRes.
     * 
     */
    public void setIntRes(int value) {
        this.intRes = value;
    }

    /**
     * Obtiene el valor de la propiedad strCadenaResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCadenaResultado() {
        return strCadenaResultado;
    }

    /**
     * Define el valor de la propiedad strCadenaResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCadenaResultado(String value) {
        this.strCadenaResultado = value;
    }

}
