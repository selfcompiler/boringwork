package Resources.Invoice;

import DAO.InvoiceDAO;
import io.dropwizard.hibernate.UnitOfWork;
import org.hibernate.validator.constraints.NotEmpty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceResourse {

    private InvoiceDAO invoiceDAO;
    public InvoiceResourse(InvoiceDAO invoiceDAO){
            this.invoiceDAO=invoiceDAO;
    }

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    @UnitOfWork
    public Response getInvoiceInfo(@QueryParam("orderId") @NotEmpty String orderId) throws Exception{
        invoiceDAO.findById(1);
        return Response.status(201).entity(invoiceDAO.findById(1)).build();

    }
}
