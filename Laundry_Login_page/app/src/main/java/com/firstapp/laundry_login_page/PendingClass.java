package com.firstapp.laundry_login_page;

import java.util.ArrayList;

public class PendingClass {
    private String quantity;
    private String date;
    private String amount;
    private String time;

    public PendingClass(String quantity, String date, String amount, String time){
        this.quantity = quantity;
        this.date = date;
        this.amount = amount;
        this.time = time;
    }

    public String getQuantity() {return quantity;}
    public String getDate() {return date;}
    public String getAmount() {return amount;}
    public String getTime() {return time;}

    public void setQuantity(String quantity) {this.quantity = quantity;}
    public void setDate(String date) {this.date = date;}
    public void setAmount(String amount) {this.amount = amount;}
    public void setTime(String time) {this.time = time;}
}
