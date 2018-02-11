package Pojo;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "Invoice")
@NamedQuery(
        name="getInvoice",
        query="SELECT p FROM Invoice p"
)
public class Invoice {
    @Column(name = "id", insertable= false, updatable = false)
    @Id
    private int id;
    @Column(name = "invoice_id")
    private String invoiceId;
    @Column(name = "invoice_number")
    private String invoiceNumber;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "seller_id")
    private String sellerId;
    @Column(name = "total_amount")
    private Float totalAmount;
    @Column(name = "total_tax")
    private Float totalTax;
    @Column(name = "total_amount_with_tax")
    private Float totalAmountWithTax;
    @Column(name = "currency")
    private String currency;
    @Column(name = "order_date")
    private String orderDate;
    @Column(name = "gstIn")
    private String gstIn;
    @Column(name = "tin")
    private String tin;
    @Column(name = "event")
    private String event;
    @Column(name = "comments")
    private String comments;
    @Column(name = "invoice_attributes")
    private String invoiceAttributes;
    @Column(name = "seller_address_id")
    private String sellerAddressId;
}
