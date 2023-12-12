package org.bth3.bai4;

import java.time.LocalDate;

public class TaiKhoan {
    private static int count;
    private String usedId, userName, phoneNumber, email;
    private double balance;
    private LocalDate dateCreated;
    private String status;

    {
        this.usedId = String.format("%05d", ++count);
    }

    public TaiKhoan(String userName, String phoneNumber, String email, double balance, LocalDate dateCreated, String status) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;
        this.dateCreated = dateCreated;
        this.status = status;
    }

// --------------------------------- getter, setter -----------------------------------------------

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TaiKhoan.count = count;
    }

    public String getUsedId() {
        return usedId;
    }

    public void setUsedId(String usedId) {
        this.usedId = usedId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//    --------------------------- end getter, setter ---------------------------------------------

}
