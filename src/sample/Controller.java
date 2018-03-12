package sample;

import java.util.List;
import javax.jws.WebService.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class Controller {

    OrderDao orderDao = new OrderDao();
    @GET
    @Path("/Orders")
    @Produces(MediaType.APPLICATION_XML)
    public List<Order> getUsers() {
        return orderDao.getAllOrders();
    }

}
