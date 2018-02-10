package Resources.Invoice;

import org.hibernate.validator.constraints.NotEmpty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceResourse {

    public InvoiceResourse(){

    }

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)

    public Response getInvoiceInfo(@QueryParam("orderId") @NotEmpty String orderId) throws Exception{

        return Response.status(201).entity("This is success").build();

    }
}
