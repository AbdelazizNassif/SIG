/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.model;

import java.util.*;

/**
 *
 * @author dell
 */
public class InvoiceHeader {
    int num;
    String customerName;
    Date date;
    double total;
    ArrayList<InvoiceLine> lines;  
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total  =0 ;
        for(int i=0; i<lines.size(); i++)
        {
            this.total += lines.get(i).itemTotal;
        }
    }
    
    public InvoiceHeader(int num, String customerName, Date date) {
        this.num = num;
        this.customerName = customerName;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
      
}
