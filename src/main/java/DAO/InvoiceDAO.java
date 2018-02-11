package DAO;

import Pojo.Invoice;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.inject.Inject;
import java.util.List;

public class InvoiceDAO extends AbstractDAO<Invoice>{

    @Inject
    public InvoiceDAO(SessionFactory factory){
        super(factory);
    }

    public List<Invoice> findById(int id){
        Query query=currentSession().getNamedQuery("getInvoice");
        // query.setParameter()
        List<Invoice> invoices=(List<Invoice>) query.getResultList();
         return invoices;
    }
}
