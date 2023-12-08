package org.bth3.bai4;

import java.time.LocalDate;

public class TaiKhoanThuong extends TaiKhoan {
    public TaiKhoanThuong(String usedId, String userName, String phoneNumber, String email, double balance, LocalDate dateCreated, String status) {
        super(usedId, userName, phoneNumber, email, balance, dateCreated, status);
    }
}
