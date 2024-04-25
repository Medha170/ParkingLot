package Models;

import java.util.Date;

public class Payment {
    private Long id;
    private Mode mode;
    private Double amount;
    private Date time;
    private PaymentStatus paymentStatus;

    public Payment(Long id, Mode mode, Double amount, Date time, PaymentStatus paymentStatus) {
        this.id = id;
        this.mode = mode;
        this.amount = amount;
        this.time = time;
        this.paymentStatus = paymentStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
