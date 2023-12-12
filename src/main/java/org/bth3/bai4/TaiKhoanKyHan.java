package org.bth3.bai4;

import java.time.LocalDate;

public class TaiKhoanKyHan extends TaiKhoan {
    private LocalDate dateDue;
    private final KyHan kyHan;

    public TaiKhoanKyHan(String usedId, String userName, String phoneNumber, String email, double balance, LocalDate dateCreated, String status, KyHan kyHan) {
        super(usedId, userName, phoneNumber, email, balance, dateCreated, status);
        this.kyHan = kyHan;

//        set date due
        if (this.kyHan.equals(KyHan.MOT_TUAN)) {
            this.dateDue = this.getDateCreated().plusWeeks(1);
        } else if (this.kyHan.equals(KyHan.MOT_THANG)) {
            this.dateDue = this.getDateCreated().plusMonths(1);
        } else {
            this.dateDue = this.getDateCreated().plusYears(1);
        }
        this.setCurrentDateDue();
    }

    //        getter, setter
    public LocalDate getDateDue() {
        return dateDue;
    }

    // set current date due
    private void setCurrentDateDue() {
        if (this.kyHan.equals(KyHan.MOT_TUAN))
            while (this.dateDue.isBefore(LocalDate.now()))
                this.dateDue = this.dateDue.plusWeeks(1);
        else if (this.kyHan.equals(KyHan.MOT_THANG))
            while (this.dateDue.isBefore(LocalDate.now()))
                this.dateDue = this.dateDue.plusMonths(1);
        else
            while (this.dateDue.isBefore(LocalDate.now()))
                this.dateDue = this.dateDue.plusYears(1);
    }

    public boolean withDraw(double soTienRut) {
        if (this.getBalance() < soTienRut) {
            return false;
        }
        return LocalDate.now().isEqual(this.dateDue);
    }
}
