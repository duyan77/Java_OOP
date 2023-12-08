package org.bth3.bai4;

import java.time.LocalDate;

public class TaiKhoanKyHan extends TaiKhoan {
    private LocalDate dateDue; // ngày đáo hạn

    public TaiKhoanKyHan(String usedId, String userName, String phoneNumber, String email, double balance, LocalDate dateCreated, String status, LocalDate dateDue) {
        super(usedId, userName, phoneNumber, email, balance, dateCreated, status);
        this.dateDue = dateDue;
    }

    enum KyHan {
        MOT_TUAN,
        MOT_THANG,
        MOT_NAM
    }

    public LocalDate getDateDue() {
        return dateDue;
    }

    public void setDateDue(LocalDate dateDue) {
        this.dateDue = dateDue;
    }
}
