package DAO;

import Pojo.Invoice;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import javax.inject.Inject;

public class InvoiceDAO extends AbstractDAO<Invoice>{

    @Inject
    public InvoiceDAO(SessionFactory factory){
        super(factory);
    }

    public Invoice findById(int id){
         namedQuery("invoice").getFirstResult();
         return null;
    }
}
