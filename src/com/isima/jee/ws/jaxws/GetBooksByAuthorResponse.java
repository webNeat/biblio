
package com.isima.jee.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getBooksByAuthorResponse", namespace = "http://ws.jee.isima.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBooksByAuthorResponse", namespace = "http://ws.jee.isima.com/")
public class GetBooksByAuthorResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.isima.jee.models.Book> _return;

    /**
     * 
     * @return
     *     returns List<Book>
     */
    public List<com.isima.jee.models.Book> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.isima.jee.models.Book> _return) {
        this._return = _return;
    }

}
