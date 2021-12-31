package by.zimin.employee;

import java.util.Date;

public class IdCard {
    private int number;
    private Date dateExpire;

    public IdCard(int number, Date dateExpire) {
        this.number = number;
        dateExpire = new Date();
        this.dateExpire = dateExpire;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }


}
