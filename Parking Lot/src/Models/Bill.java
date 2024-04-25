package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill {
    private Long id;
    private Ticket ticket;
    private Date exitTime;
    private Double amount;
    private List<Payment> payment;
    private PaymentStatus billStatus;

    public Bill(Long id, Ticket ticket, Double amount, List<Payment> payment) {
        this.id = id;
        this.ticket = ticket;
        this.amount = amount;
        this.payment = new ArrayList<>();
        this.billStatus = PaymentStatus.PENDING;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public PaymentStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(PaymentStatus billStatus) {
        this.billStatus = billStatus;
    }
}
