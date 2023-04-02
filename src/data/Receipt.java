
/** Required package class namespace */
package data;

/** Required imports */
import java.io.Serializable;

/**
 * Receipt.java - represents an electronic receipt that stores the contents of
 * a receipt (details of an order) and other important details to be stored
 * for records and viewing
 * 
 * @author mikex
 */
public class Receipt implements Serializable {
    
    /** the global properties of this receipt object */
    private String customerName;
    private String orderType;
    private String number;
    private String content;

    /**
     * A constructor method which sets the class properties. Done by connecting 
     * the passed in parameters to the encapsulated properties (global variables
     * of this class)
     * 
     * @param customerName the name of the customer of the receipt
     * @param orderType the type of order on the receipt
     * @param number the customer's number on the receipt
     * @param content the contents of the receipt object
     */
    public Receipt(String customerName, String orderType, String number, 
            String content) {
        this.customerName = customerName;
        this.orderType    = orderType;
        this.number       = number;
        this.content      = content;
    }
    
    /**
     * An Accessor method for the encapsulated class property
     * @return the name of the customer for this receipt
     */
    public String getCustomerName() {
        return customerName;
    }
    
    /**
     * An Accessor method for the encapsulated class property
     * @return the type of order for this receipt object
     */
    public String getOrderType() {
        return orderType;
    }
    
    /**
     * An Accessor method for the encapsulated class property
     * @return the customer's number for this receipt object
     */
    public String getNumber() {
        return number;
    }
    
    /**
     * An Accessor method for the encapsulated class property
     * @return the contents of the actual receipt object
     */
    public String getContent() {
        return content;
    }
    
    /**
     * String representation of this object
     * 
     * @return the object represented as a String
     */
    @Override
    public String toString() {
        return customerName + " | " + orderType + " | " + number;
    }
}
