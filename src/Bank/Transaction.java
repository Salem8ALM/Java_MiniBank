package Bank;

import java.util.Calendar;
import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private double amount;

    public Transaction(Date date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.toLowerCase()=="deposit" || type.toLowerCase()=="withdraw") {
            this.type = type;
        }
        else{
            System.out.println("set a valid type (withdraw or deposit)");

        }

    }


}
