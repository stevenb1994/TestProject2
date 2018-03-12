package sample;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int orderId;
    private int customerId;
    private int numberOfBricks;



    public Order(int orderId, int customerId, int numberOfBricks)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.numberOfBricks = numberOfBricks;
    }

    public int getOrderId()
    {
        return orderId;
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public int getNumberOfBricks()
    {
        return numberOfBricks;
    }
    @XmlElement
    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }
    @XmlElement
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    @XmlElement
    public void setNumberOfBricks(int numberOfBricks)
    {
        this.numberOfBricks = numberOfBricks;
    }



}
